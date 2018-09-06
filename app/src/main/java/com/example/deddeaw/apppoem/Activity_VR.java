package com.example.deddeaw.apppoem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_VR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__vr);
    }

    public void clicktoView1(View view) {
        Intent gotoView1 = new Intent(Intent.ACTION_VIEW);
        gotoView1.setData(Uri.parse("https://www.facebook.com/photo.php?fbid=1832523806831906&set=a.568735453210754&type=3&theater"));
        startActivity(gotoView1);
    }
}
