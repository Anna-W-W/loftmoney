package com.aw.loftmoney.cells;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.aw.loftmoney.R;

public class AddItemActivity extends AppCompatActivity {

    private EditText NameEditText;
    private EditText PriceEditText;
    private Button addButton;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        NameEditText = (EditText) findViewById(R.id.et_name);
        PriceEditText = (EditText) findViewById(R.id.et_price);
        addButton =(Button) findViewById(R.id.add_button);

        addButton.setOnClickListener(v -> {

            Intent intent = new Intent ();
            intent.putExtra("name", NameEditText.getText().toString());
            intent.putExtra("price", PriceEditText.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}