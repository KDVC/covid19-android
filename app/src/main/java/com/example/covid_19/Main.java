package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    CheckBox cbCough,cbFever,cbTiredness,cbBreathingDifficulty;
    Button check;
    TextView textViewOutput,textViewContent;
    static int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        cbCough = findViewById(R.id.cough_chk_box);
        cbFever = findViewById(R.id.fever_chk_box);
        cbTiredness = findViewById(R.id.tiredness_chk_box);
        cbBreathingDifficulty = findViewById(R.id.bd_chk_box);
        textViewOutput = findViewById(R.id.output);
        textViewContent = findViewById(R.id.contents);
        check = findViewById(R.id.contact);

        i=0;

        cbCough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cbCough.isChecked()){
                    i++;
                    Log.d("Mytag","cough: "+i);
                    cbCough.setTextColor(getResources().getColor(R.color.colorChkbx));
                    if(i==4){
                        check.setBackgroundColor(getResources().getColor(R.color.colorButton));
                        Log.d("Mytag","testlog2");
                    }
                    else {
                        check.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    }
                }
                else {
                    cbCough.setTextColor(getResources().getColor(R.color.colorBlack));
                    i--;
                    if(i==4){
                        check.setBackgroundColor(getResources().getColor(R.color.colorButton));
                        Log.d("Mytag","testlog2");
                    }
                    else {
                        check.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    }
                }
            }
        });

        cbFever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbFever.isChecked()){
                    i++;
                    Log.d("Mytag","fever: "+i);
                    cbFever.setTextColor(getResources().getColor(R.color.colorChkbx));
                    if(i==4){
                        check.setBackgroundColor(getResources().getColor(R.color.colorButton));
                        Log.d("Mytag","testlog2");
                    }
                    else {
                        check.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    }
                }
                else {
                    cbFever.setTextColor(getResources().getColor(R.color.colorBlack));
                    i--;
                    if(i==4){
                        check.setBackgroundColor(getResources().getColor(R.color.colorButton));
                        Log.d("Mytag","testlog2");
                    }
                    else {
                        check.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    }
                }
            }
        });

        cbTiredness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbTiredness.isChecked()){
                    i++;
                    Log.d("Mytag","tired: "+i);
                    cbTiredness.setTextColor(getResources().getColor(R.color.colorChkbx));
                    if(i==4){
                        check.setBackgroundColor(getResources().getColor(R.color.colorButton));
                        Log.d("Mytag","testlog2");
                    }
                    else {
                        check.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    }
                }
                else {
                    cbTiredness.setTextColor(getResources().getColor(R.color.colorBlack));
                    i--;
                    if(i==4){
                        check.setBackgroundColor(getResources().getColor(R.color.colorButton));
                        Log.d("Mytag","testlog2");
                    }
                    else {
                        check.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    }
                }
            }
        });

        cbBreathingDifficulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbBreathingDifficulty.isChecked()){
                    i++;
                    Log.d("Mytag","breath: "+i);
                    cbBreathingDifficulty.setTextColor(getResources().getColor(R.color.colorChkbx));
                    if(i==4){
                        check.setBackgroundColor(getResources().getColor(R.color.colorButton));
                        Log.d("Mytag","testlog2");
                    }
                    else {
                        check.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    }
                }
                else {
                    cbBreathingDifficulty.setTextColor(getResources().getColor(R.color.colorBlack));
                    i--;
                    if(i==4){
                        check.setBackgroundColor(getResources().getColor(R.color.colorButton));
                        Log.d("Mytag","testlog2");
                    }
                    else {
                        check.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    }
                }
            }
        });

        Log.d("Mytag","testlog: "+i);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewContent.setText("We are suspecting you are as a covid-19 patient. Please contact below emergency number immediately");
                textViewOutput.setText("1390");
            }
        });

    }
}
