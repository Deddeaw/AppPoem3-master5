package com.example.deddeaw.apppoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_Search extends AppCompatActivity {

    private String[] data;
    private ListView listView;

    private ArrayList<ListEntry> data_nomal;
    private ArrayList<ListEntry> data_search;



    private EditText main_listview_edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__search);

        // get data
        data = getResources().getStringArray(R.array.data);

        // Loop data
        data_nomal = new ArrayList<ListEntry>();
        for (int i = 0; i < data.length; i++) {
            ListEntry listEntry = new ListEntry();
            listEntry.setTitle(data[i]);
            data_nomal.add(listEntry);
        }


        // view metching...
        main_listview_edittext = (EditText) findViewById(R.id.main_listview_edittext);
        listView = (ListView) findViewById(R.id.main_listview);
        doLisNormal();

        // event Edittext
        main_listview_edittext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //เวลาใส่ข้อมูลจะไปเปรียนเทียบกับข้อมูลที่อยู่ใน listview
                if (main_listview_edittext.length() != 0) {
                    //เวลาค้นหาจะ loop ค่าเก็บไว้
                    data_search = new ArrayList<ListEntry>();
                    for (int i = 0; i < data_nomal.size(); i++) {

                        if (data_nomal.get(i).getTitle().contains(s)){
                            ListEntry listEntry = new ListEntry();
                            listEntry.setTitle(data_nomal.get(i).getTitle());
                            data_search.add(listEntry);
                        }
                    }
                    //เวลาค้นหาเสร็จก็เรียกใช้ adapter ของชนิดที่เป็น search
                    doListSearch();
                }else {
                    doLisNormal();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void doListSearch() {
        listView.setAdapter(new CustomAdapter(data_search));
        //มีข้อความขึ้น
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Activity_Search.this,data_search.get(position).getTitle(),Toast.LENGTH_SHORT).show();

                // new Intent คือการเรียกหน้าใหม่
                Intent intent = new Intent(Activity_Search.this, page2Activity.class);
                //กรอกข้อมูลที่จะใส่ลงไป
                intent.putExtra("title", data_search.get(position).getTitle());
                startActivity(intent);
            }
        });
    }

    private void doLisNormal() {
        listView.setAdapter(new CustomAdapter(data_nomal));
        //มีข้อความขึ้น
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Activity_Search.this,data_nomal.get(position).getTitle(),Toast.LENGTH_SHORT).show();

                // new Intent คือการเรียกหน้าใหม่
                Intent intent = new Intent(Activity_Search.this, page2Activity.class);
                //กรอกข้อมูลที่จะใส่ลงไป
                intent.putExtra("title", data_nomal.get(position).getTitle());
                startActivity(intent);
            }
        });
    }
    //ปุ่มกดย้อนกลับ
    public void backtomain(View view) {
        Intent backtomain = new Intent(Activity_Search.this, MainActivity.class);
        startActivity(backtomain);
    }

    public class CustomAdapter extends BaseAdapter{

        private ArrayList<ListEntry> mData;
        private Holder holder = new Holder();

        public CustomAdapter(ArrayList<ListEntry> data1){
            this.mData = data1;
        }

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = View.inflate(Activity_Search.this, R.layout.listview_item_layout, null);


            if (convertView != null){

                //view matching child
                holder.title = (TextView) convertView.findViewById(R.id.listview_item_title);

                // set text
                holder.title.setText(mData.get(position).getTitle());

                convertView.setTag(holder);
            }else {
                convertView = (View) convertView.getTag();
            }
            return convertView;
        }

        public class Holder{
            public TextView title;
        }

    }
}
