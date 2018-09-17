package com.example.deddeaw.apppoem;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

public class Activity_boat1 extends AppCompatActivity {


        TextView titleTextView, detailTextView;
        ImageView ImageView;
        Button backbutton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_boat1);

            //Initial View ผูกตัวแปรบน JAVA กับ XML
            titleTextView = findViewById(R.id.textView18);
            detailTextView = findViewById(R.id.textView47);
            ImageView = findViewById(R.id.imageView2);

            //รับข้อมูลจากการ Intent ไปแสดงผลบนหน้า XML
            titleTextView.setText(getIntent().getStringExtra("title"));
            detailTextView.setText(getIntent().getStringExtra("detailboat"));
            ImageView.setImageResource(getIntent().getIntExtra("Image1",R.drawable.boat1));



        }//end onCreate Method


    public void clicktoLisview(View view) {
        Intent backtoLisview = new Intent(Activity_boat1.this, Activity_History_Boat2.class);
        startActivity(backtoLisview);
    }
}//end Class
