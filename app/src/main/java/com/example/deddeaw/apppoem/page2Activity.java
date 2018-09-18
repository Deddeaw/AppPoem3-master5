package com.example.deddeaw.apppoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class page2Activity extends AppCompatActivity {

     TextView page2_title;
            //TextView detailTextView;
            //ImageView ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");


        //Initial View ผูกตัวแปรบน JAVA กับ XML
        // View maching
        //ImageView = findViewById(R.id.imageView5);
       // detailTextView = findViewById(R.id.textView69);
        page2_title = findViewById(R.id.page2_title);
        page2_title.setText(title);


        //รับข้อมูลจากการ Intent ไปแสดงผลบนหน้า XML
        page2_title.setText(getIntent().getStringExtra("title"));
        //detailTextView.setText(getIntent().getStringExtra("detailboat2"));
        //ImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.b3));//รูปที่จะใส่


    }
    // ปุ่มย้อนกลับ
    public void backtoSearch(View view) {
        Intent backtoSearch = new Intent(page2Activity.this, Activity_Search.class);
        startActivity(backtoSearch);
    }
}
