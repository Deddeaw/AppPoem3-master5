    package com.example.deddeaw.apppoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void clicktoHisA(View view) {
            Intent gotoHisA = new Intent(MainActivity.this, ActivityHistory.class);
            startActivity(gotoHisA);
        }

        public void clicktoBoat(View view) {
            Intent gotoHisBoat = new Intent(MainActivity.this, ActivityHistoryBoat.class);
            startActivity(gotoHisBoat);
        }

        public void gotodetailpoem(View view) {
            Intent gotodetailPoem = new Intent(MainActivity.this, Activity_Poem.class);
            startActivity(gotodetailPoem);
        }

        public void clicktoboat(View view) {
            Intent gotohisboat = new Intent(MainActivity.this, Activity_MenuBoat.class);
            startActivity(gotohisboat);
        }

        public void clicktoVR(View view) {
            Intent gotoVR = new Intent(MainActivity.this,Activity_VR.class);
            startActivity(gotoVR);
        }
    }
