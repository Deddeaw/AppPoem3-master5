package com.example.deddeaw.apppoem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Poem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__poem);
    }

    public void backtomain(View view) {
        Intent backtomain = new Intent(Activity_Poem.this, MainActivity.class);
        startActivity(backtomain);
    }

    public void clicktodetail2(View view) {
        Intent gotodetail2 = new Intent(Activity_Poem.this, Activity_Detail2.class);
        startActivity(gotodetail2);
    }

    public void clicktolis(View view) {
        Intent gotoLis = new Intent(Activity_Poem.this, ActivityVedio.class);
        startActivity(gotoLis);
    }

    //public void clicktolis(View view) {
    //   Intent gotolisten = new Intent(Intent.ACTION_VIEW);
    //    gotolisten.setData(Uri.parse("https://www.youtube.com/watch?v=5lnIHlw7Bwk&t=1s"));
    //    startActivity(gotolisten);
    //}


}
