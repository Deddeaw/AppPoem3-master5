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
        // หน้าประวัติความเป็นมา
        public void clicktoHisA(View view) {
            Intent gotoHisA = new Intent(MainActivity.this, ActivityHistory.class);
            startActivity(gotoHisA);
        }
        //
        //public void clicktoBoat(View view) {
        //    Intent gotoHisBoat = new Intent(MainActivity.this, ActivityHistoryBoat.class);
        //    startActivity(gotoHisBoat);
        //}
        // หน้าบทประพันธ์
        public void gotodetailpoem(View view) {
            Intent gotodetailPoem = new Intent(MainActivity.this, Activity_Poem.class);
            startActivity(gotodetailPoem);
        }
        // หน้าประวัติเรือ
        public void clicktoboat(View view) {
            Intent gotohisboat = new Intent(MainActivity.this, Activity_MenuBoat.class);
            startActivity(gotohisboat);
        }


        // ทดลอง ค้นหา
        public void clicktoSearch(View view) {
            Intent gotoSearch = new Intent(MainActivity.this, Activity_Search.class);
            startActivity(gotoSearch);
        }
        //หน้า VR
        public void clickVR(View view) {
            Intent gotoVR = new Intent(MainActivity.this, Activity_Vr2.class);
            startActivity(gotoVR);
        }
    }
