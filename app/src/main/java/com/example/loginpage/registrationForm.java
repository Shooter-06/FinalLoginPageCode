
package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class registrationForm extends AppCompatActivity {

    EditText userId, pass, recPass;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);

        userId = findViewById(R.id.editTextTextPersonName3);
        pass =findViewById(R.id.editTextTextPersonName4);
        recPass =findViewById(R.id.editTextTextPersonName5);
        save = findViewById(R.id.button3);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pax1= pass.getText().toString();
                String repax1= recPass.getText().toString();

                if(userId.getText().toString().equals("") || pass.getText().toString().equals("")){
                    Toast i= Toast.makeText(getApplicationContext(), "You must enter an ID  or a password to register",Toast.LENGTH_SHORT);
                    i.show();
                }
                if (!pass.getText().toString().equals(recPass.getText().toString())){
                    Toast i= Toast.makeText(getApplicationContext(), "You must enter the same password ",Toast.LENGTH_SHORT);
                    i.show();
                }else{
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    i.putExtra("USER", userId.getText().toString());
                    i.putExtra("PASS", pass.getText().toString());
                    startActivity(i);
                }
            }
        });
    }
}