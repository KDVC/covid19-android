package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class StaySafeActivity extends AppCompatActivity {

    ListView listView;

    int[] images = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4};
    String[] names = {"Cough and sneeze into your elbow","Wash your hands frequently!","Keep your distance","Reducing the risk for older"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stay_safe);

        listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{
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
            return 0;
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


