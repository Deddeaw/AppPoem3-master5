package com.example.deddeaw.apppoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }

    public void clickBacktoMain(View view) {
        Intent BacktoMain = new Intent(ActivityHistory.this, MainActivity.class);
        startActivity(BacktoMain);
    }

    public void clickbacktomain(View view) {
        Intent backtomain = new Intent(ActivityHistory.this, MainActivity.class);
        startActivity(backtomain);
    }
}
