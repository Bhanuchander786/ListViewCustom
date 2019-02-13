package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String names[] = {"Bhagvan", "Vapas Bhagvan", "Firse bhagvan", "reddy", "Bhanu", "Rohit", "patil", "Amol", "pankaj", "Rupesh", "Janak"};
    List<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        arrayList=new ArrayList<>();

        arrayList=Arrays.asList(names);
   


        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(new ListAdapter());
    }

    class ListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
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
            if (convertView == null)
                convertView = getLayoutInflater().inflate(R.layout.layout, parent, false);

          //  ((TextView)convertView.findViewById(R.id.txt1)).setText(names[position]);
            ((TextView)convertView.findViewById(R.id.txt1)).setText(arrayList.get(position));

            return convertView;
        }
    }
}
