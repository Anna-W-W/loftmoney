
package com.aw.loftmoney.cells;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.aw.loftmoney.R;

import java.util.ArrayList;
import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {

    private List<Item> moneyItemlList = new ArrayList<>();

    public void setData(List<MoneyItem> moneyItemModels) {
        moneyItemlList.clear();
        moneyItemlList.addAll(moneyItemModels);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.item_money;

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(layoutIdForListItem, parent, false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        holder.bind(moneyItemlList.get(position));
    }

    @Override
    public int getItemCount() {

        return moneyItemlList.size();
    }


    static class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView price;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tv_name_expenses);
            price = itemView.findViewById(R.id.tv_price_expenses);

        }

        public void bind(Item item) {
            name.setText(item.getName());
            price.setText(new SpannableString(item.getPrice() + " \u20BD"));

            if (item.getCurrentPosition() == 0) {
                price.setTextColor(ContextCompat.getColor(price.getContext(), R.color.priceColor));
            } else if (item.getCurrentPosition() == 1) {
                price.setTextColor(ContextCompat.getColor(price.getContext(), R.color.priceColor_2));
            }
        }
    }
}