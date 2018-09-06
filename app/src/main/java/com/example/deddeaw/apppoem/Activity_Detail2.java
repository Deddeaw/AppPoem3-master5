package com.example.deddeaw.apppoem;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Detail2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__detail2);
    }

    public void clicktopoem(View view) {
        Intent backtopoem = new Intent(Activity_Detail2.this, Activity_Poem.class);
        startActivity(backtopoem);
    }
}
