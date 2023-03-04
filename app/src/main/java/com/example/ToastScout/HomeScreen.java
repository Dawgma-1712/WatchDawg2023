package com.example.ToastScout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeScreen extends AppCompatActivity implements View.OnClickListener{

    public static EditText eventKeyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        findViewById (R.id.startMatch).setOnClickListener(this);

        eventKeyText = (EditText)  findViewById(R.id.eventKey);

    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.startMatch:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                MainActivity.eventKey = eventKeyText.getText().toString();
                break;


        }
    }
}