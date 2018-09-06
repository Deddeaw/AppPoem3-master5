package com.example.deddeaw.apppoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Detail4 extends AppCompatActivity {

    TextView titleTextView, detailTextView;
    ImageView signImageView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__detail4);

        //Initial View ผูกตัวแปรบน JAVA กับ XML
        titleTextView = findViewById(R.id.textView52);
        detailTextView = findViewById(R.id.textView53);
        signImageView = findViewById(R.id.imageView4);

        //รับข้อมูลจากการ Intent ไปแสดงผลบนหน้า XML
        titleTextView.setText(getIntent().getStringExtra("title2"));
        detailTextView.setText(getIntent().getStringExtra("detailboat2"));
        //รูปที่จะใส่
        signImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.a));


    }//end onCreate Method
    public void clicktoLisview(View view) {
        Intent backtoLisview = new Intent(Activity_Detail4.this, ActivityHistoryBoat.class);
        startActivity(backtoLisview);
    }


    public void clicktomenu(View view) {
        Intent backtomenu = new Intent(Activity_Detail4.this, Activity_MenuBoat.class);
        startActivity(backtomenu);
    }
}//end Class