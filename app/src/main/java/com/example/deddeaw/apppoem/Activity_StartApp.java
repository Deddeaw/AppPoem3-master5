package com.example.deddeaw.apppoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_StartApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__start_app);
    }

    public void clicktomain(View view) {
        Intent gotomain = new Intent(Activity_StartApp.this, MainActivity.class);
        startActivity(gotomain);
    }
}
