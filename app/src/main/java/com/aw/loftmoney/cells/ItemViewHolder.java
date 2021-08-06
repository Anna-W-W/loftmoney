package com.aw.loftmoney.cells;

import android.support.v7.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder{
    private TextView name;
    private TextView price;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
        price = itemView.findViewById(R.id.price);
    }

    public void bind(Item item){
        name.setText(item.getName());
        price.setText(item.getPrice());
    }
}
