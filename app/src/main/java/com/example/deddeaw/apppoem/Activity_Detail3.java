package com.example.deddeaw.apppoem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Detail3 extends AppCompatActivity {

    TextView titleTextView, detailTextView;
    ImageView signImageView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__detail3);

        //Initial View ผูกตัวแปรบน JAVA กับ XML
        titleTextView = findViewById(R.id.textView2);
        detailTextView = findViewById(R.id.textView4);
        signImageView = findViewById(R.id.imageView);

        //รับข้อมูลจากการ Intent ไปแสดงผลบนหน้า XML
        titleTextView.setText(getIntent().getStringExtra("title"));
        detailTextView.setText(getIntent().getStringExtra("detailboat"));
        //รูปที่จะใส่
        signImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.a));


    }//end onCreate Method



}//end Class