package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PepperoniPizza extends AppCompatActivity {

    Button tenAdd, tenMinus, twentyAdd, twentyMinus, thirtyAdd, thirtyMinus;
    Button smallAdd, smallMinus, mediumAdd, mediumMinus, bigAdd, bigMinus, order;

    EditText priceText;
    TextView smallCounter, mediumCounter, bigCounter, id;
    int a=0;

    EditText message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pepperoni_pizza);

        priceText= findViewById(R.id.editTextTextPersonName);

        tenAdd =findViewById(R.id.button2);
        tenMinus =findViewById(R.id.button3);

        twentyAdd=findViewById(R.id.button);
        twentyMinus=findViewById(R.id.button4);

        thirtyAdd=findViewById(R.id.button5);
        thirtyMinus=findViewById(R.id.button6);


        id =findViewById(R.id.textView2);

        id.setText(getIntent().getStringExtra("FiacreID" ));
        tenAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a =a+10;
                priceText.setText(String.valueOf(a));
            }
        });
        tenMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a == 10){
                    a =10;
                }else{
                    a =a-10;
                    priceText.setText(String.valueOf(a));
                }

            }
        });

        twentyAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a= a+20;
                priceText.setText(String.valueOf(a));
            }
        });
        twentyMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a == 20){
                    a =20;
                }else{
                    a=a-20;
                    priceText.setText(String.valueOf(a));
                }
            }
        });

        thirtyAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+30;
                priceText.setText(String.valueOf(a));
            }
        });

        thirtyMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a == 30){

                }else{
                    a=a-30;
                    priceText.setText(String.valueOf(a));
                }
            }
        });

        //Toppings values
        smallCounter= findViewById(R.id.textView27);
        smallAdd =findViewById(R.id.button8);
        smallMinus =findViewById(R.id.button7);

        mediumCounter= findViewById(R.id.textView29);
        mediumAdd=findViewById(R.id.button9);
        mediumMinus=findViewById(R.id.button10);

        bigCounter= findViewById(R.id.textView30);
        bigAdd=findViewById(R.id.button11);
        bigMinus=findViewById(R.id.button12);

        smallAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+2;
                priceText.setText(String.valueOf(a));
            }
        });


        smallMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a == 2){
                    a=2;
                }else{
                    a=a-2;
                    priceText.setText(String.valueOf(a));
                }
            }
        });

        mediumAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+3;
                priceText.setText(String.valueOf(a));
            }
        });

        mediumMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a == 3){

                }else{
                    a=a-3;
                    priceText.setText(String.valueOf(0));
                }
            }
        });

        bigAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+5;
                priceText.setText(String.valueOf(a));
            }
        });

        bigCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a == 5){
                    a=5;
                }else{
                    a=a-5;
                    priceText.setText(String.valueOf(a));
                }
            }
        });

        id= findViewById(R.id.textView2);
        id.setText(getIntent().getStringExtra("USER"));

        order =findViewById(R.id.button13);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LastPage.class);
                String pri= priceText.getText().toString();
                //there will a price charge of 1.25 on every order
                double total = Integer.parseInt(pri) * 1.25;
                String value = String.valueOf(total);
                i.putExtra("Total", value);
                startActivity(i);
            }
        });
    }
}