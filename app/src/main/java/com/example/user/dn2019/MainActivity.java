package com.example.user.dn2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText password = findViewById(R.id.Password);
                EditText username = findViewById(R.id.Username);
                String user = username.getText().toString();
                String pass = password.getText().toString();
                Intent intent = new Intent(MainActivity.this,Main_page.class);
                startActivity(intent);
                if(user == "" && pass == ""){

                }
                else{
                    Toast.makeText(getBaseContext(),user,Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
