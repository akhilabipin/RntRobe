package com.example.rntrobe.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.rntrobe.R;

//import static com.example.rntrobe.R.layout.activity_selectcity;

public class SelectcityActivity extends AppCompatActivity {

    Button button;
    //private Context context;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectcity);
        addListenerOnButton();
    }

    private void addListenerOnButton() {

        final Context context = this;
        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),WomandressActivity.class);
                startActivity(intent);

            }
        });
    }

    }

