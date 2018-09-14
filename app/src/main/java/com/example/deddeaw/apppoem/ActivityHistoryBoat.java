package com.example.deddeaw.apppoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActivityHistoryBoat extends AppCompatActivity {
    ListView listView1;
    private String[] titleStrings, detailStrings;
    //.ใส่รูปภาพเรือแล้วจะรันเอง
    private int[] ints = new int[]{R.drawable.boat1type1,R.drawable.boat2type1,R.drawable.boat3type1,
            R.drawable.boat4type1,R.drawable.boat5type1,R.drawable.boat6type1,R.drawable.boat7type1,R.drawable.boat8type1
            ,R.drawable.boat9type1,R.drawable.boat10type1,R.drawable.boat11type1,R.drawable.boat12type1,R.drawable.boat13type1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_boat);
        listView1 = findViewById(R.id.Listview1);
        titleStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detailboat);

        MyAdapter1 myAdapter = new MyAdapter1(ActivityHistoryBoat.this, ints, titleStrings, detailStrings);
        listView1.setAdapter(myAdapter);



        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //เชื่อมหน้าเปลี่ยน
                Intent detailIntent = new Intent(ActivityHistoryBoat.this,Activity_boat1.class);
                detailIntent.putExtra("title", titleStrings[i]);
                detailIntent.putExtra("detailboat", detailStrings[i]);
                detailIntent.putExtra("Image1", ints[i]);
                startActivity(detailIntent);
            }
        });


    }

    public void clicktomain(View view) {
        Intent backtomain = new Intent(ActivityHistoryBoat.this,Activity_MenuBoat.class);
        startActivity(backtomain);
    }
}