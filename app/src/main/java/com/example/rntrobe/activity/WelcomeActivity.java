package com.example.rntrobe.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.rntrobe.R;

public class WelcomeActivity extends AppCompatActivity {
Button button;
Button button2;

    private Context context;
     @Override
     public void onCreate(@Nullable Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome); 
        addListenerOnButton();
     }

    public void addListenerOnButton() {
        final Context context = this;
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),EntermobActivity.class);
                startActivity(intent);

            }
        });
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),EntermobActivity.class);
                startActivity(intent);

            }
        });

    }


}
