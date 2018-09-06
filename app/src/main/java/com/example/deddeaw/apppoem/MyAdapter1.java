package com.example.deddeaw.apppoem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter1 extends BaseAdapter {
private Context context;
private int[] ints;
private String[] titleStrings, detailStrings,Poem;

public MyAdapter1 (Context context, int[] ints, String[] titleStrings, String[] detailStrings)  {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;


        }

@Override
public int getCount() { //นับจำนวนข้อมูลใน Array แล้วส่งข้อมูลไปยัง Method getView()
        return ints.length;
        }

@Override
public Object getItem(int i) {
        return null;
        }

@Override
public long getItemId(int i) {
        return 0;
        }

@Override
public View getView(int i, View view, ViewGroup viewGroup) {//รับข้อมูลจาก Method getCount() มาแสดงผลบนแอป

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.activity__list_view1, viewGroup, false);

        //ผูกตัวแปรบน JAVA กับอิลิเมนท์บน XML ที่หน้า my_listview
        ImageView imageView = view1.findViewById(R.id.imageView7);
        TextView titleTextView = view1.findViewById(R.id.txv7);
        //TextView detailTextView = view1.findViewById(R.id.txv2);

        //Show data นำข้อมูลไปแสดงผลบนแอป
        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        //detailTextView.setText(detailStrings[i]);

        return view1;
        }


        }
