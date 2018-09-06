package com.example.deddeaw.apppoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_MenuBoat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__menu_boat);
    }

    public void clicktomain(View view) {
        Intent backtomain = new Intent(Activity_MenuBoat.this, MainActivity.class);
        startActivity(backtomain);
    }

    public void clickToHisboat1(View view) {
        Intent toHisBoat1 = new Intent(Activity_MenuBoat.this, ActivityHistoryBoat.class);
        startActivity(toHisBoat1);
    }

    public void clickToHisBoat2(View view) {
        Intent toHisBoat2 = new Intent(Activity_MenuBoat.this, Activity_History_Boat2.class);
        startActivity(toHisBoat2);

    }
}
