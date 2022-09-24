package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView userN, userP;
    Button b1, regB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userN = findViewById(R.id.editTextTextPersonName);
        userP = findViewById(R.id.editTextTextPersonName2);
        b1 = findViewById(R.id.button);
        regB = findViewById(R.id.button2);
        regB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), registrationForm.class);
                startActivity(i);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            String username = getIntent().getStringExtra("USER");
            String password = getIntent().getStringExtra("PASS");
            @Override
            public void onClick(View view) {
                if(userN.getText().toString().equals(username) && userP.getText().toString().equals(password)){
                    Intent i = new Intent(getApplicationContext(), HomePage.class);
                    username ="Fiacre APP";
                    i.putExtra("USER", username);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(), "Enter the Valid username and password or Register", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}