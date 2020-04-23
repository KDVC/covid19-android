package com.example.covid_19;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Advice extends AppCompatActivity {

    ListView listView;
    String names[] = {"Myth busters","When and how to use masks"};
    int images[] = {R.drawable.advice1,R.drawable.advice2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);

        listView = findViewById(R.id.adviceList);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.d("Item click","item selected: "+ listView.getItemIdAtPosition(position));
                listView.getItemIdAtPosition(position);
                if(listView.getItemIdAtPosition(position)==0){
                    Intent intent = new Intent(Advice.this,AdviceContents.class);
                    startActivity(intent);
                }
                else if(listView.getItemIdAtPosition(position)==1){
                    Intent intent = new Intent(Advice.this,AdviceContentMask.class);
                    startActivity(intent);
                }

            }
        });
    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView = view.findViewById(R.id.ssimageView);
            TextView textView = view.findViewById(R.id.sstextView);

            imageView.setImageResource(images[position]);
            textView.setText(names[position]);
            return view;
        }
    }
}
