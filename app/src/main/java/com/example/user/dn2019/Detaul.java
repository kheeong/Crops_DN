package com.example.user.dn2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Detaul extends AppCompatActivity {
    Button Add,Remove;
    TextView text;
    float num;
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaul);
        configureToolbar();
        text = findViewById(R.id.textView5);
        Add = findViewById(R.id.ADD);
        Remove = findViewById(R.id.Remove);
        num = 0.00f;
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + 25;
                text.setText(String.valueOf(num));
            }
        });

        Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num > 0){
                    num = num - 25;
                    text.setText(String.valueOf(num));
                }
            }
        });
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void configureToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getString(R.string.app_name));
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
    }
}
