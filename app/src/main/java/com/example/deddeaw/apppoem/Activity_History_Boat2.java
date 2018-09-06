package com.example.deddeaw.apppoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Activity_History_Boat2 extends AppCompatActivity {
    ListView listView2;
    private String[] titleStrings, detailStrings;
    //.ใส่รูปภาพเรือแล้วจะรันเอง
    private int[] ints = new int[]{R.drawable.b1,R.drawable.b2,R.drawable.b3,
            R.drawable.b4,R.drawable.b5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__history__boat2);
        listView2 = findViewById(R.id.listView2);
        titleStrings = getResources().getStringArray(R.array.title2);
        detailStrings = getResources().getStringArray(R.array.detailboat2);

        MyAdapter1 myAdapter = new MyAdapter1(Activity_History_Boat2.this, ints, titleStrings, detailStrings);
        listView2.setAdapter(myAdapter);



        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //เชื่อมหน้าเปลี่ยน
                Intent detailIntent = new Intent(Activity_History_Boat2.this,Activity_Detail4.class);
                detailIntent.putExtra("title2", titleStrings[i]);
                detailIntent.putExtra("detailboat2", detailStrings[i]);
                detailIntent.putExtra("Image1", ints[i]);
                startActivity(detailIntent);
            }
        });


    }

    public void clickMenuBoat2(View view) {
        Intent tomainHisBoat2 = new Intent(Activity_History_Boat2.this, Activity_MenuBoat.class);
        startActivity(tomainHisBoat2);
    }
}
