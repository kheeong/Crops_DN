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
        final EditText username = findViewById(R.id.Username);
        final EditText password = findViewById(R.id.Password);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user == "one" && pass == "1"){
                    Intent intent = new Intent(MainActivity.this,Main_page.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getBaseContext(),"Incorrect Password or Username",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
