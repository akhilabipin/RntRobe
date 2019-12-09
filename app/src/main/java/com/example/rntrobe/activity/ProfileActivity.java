package com.example.rntrobe.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.rntrobe.R;

public class ProfileActivity extends AppCompatActivity {

    Button button;
    protected  void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        addListenerOnButton();

    }

    private void addListenerOnButton() {
        final Context context = this;
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),SelectcityActivity.class);
                startActivity(intent);

            }
        });
    }


}



