package com.example.user.dn2019;

import android.support.v4.util.ArraySet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Detaul extends AppCompatActivity {
    Button Add,Remove,Acart;
    TextView text,total;
    int num,index;
    Toolbar mToolbar;
    String[] array;
    ArrayList<String> myList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaul);
        configureToolbar();
        total = findViewById(R.id.total);
        Acart = findViewById(R.id.Cart);
        text = findViewById(R.id.textView5);
        Add = findViewById(R.id.ADD);
        Remove = findViewById(R.id.Remove);
        num = 0;
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + 1;
                text.setText(String.valueOf(num));
                total.setText(String.valueOf(num*25));
            }
        });

        Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num > 0){
                    num = num - 1;
                    text.setText(String.valueOf(num));
                    total.setText(String.valueOf(num*25));
                }
            }
        });

        Acart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = ((cart_variable) getBaseContext()).getLen();
                Toast.makeText(Detaul.this,num,Toast.LENGTH_SHORT).show();
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
