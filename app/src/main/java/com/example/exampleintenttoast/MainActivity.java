package com.example.exampleintenttoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TintableCheckedTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button2, button3, button4, button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Main Actity",Toast.LENGTH_LONG).show();
         button2= findViewById(R.id.sec_button);
         button3= findViewById(R.id.third_button);
         button4= findViewById(R.id.four_button);
         button5= findViewById(R.id.five_button);


                 button2.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                         startActivity(intent);
                     }
                 });

         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent2 = new Intent(MainActivity.this,ThirdActivity.class);
                 startActivity(intent2);
             }
         });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent3 = new Intent(MainActivity.this,FourthActivity.class);
               startActivity(intent3);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this,FifthActivity.class);
                startActivity(intent4);
            }
        });
    }
}