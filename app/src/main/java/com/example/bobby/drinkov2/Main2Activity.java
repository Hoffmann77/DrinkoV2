package com.example.bobby.drinkov2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {


    public Button Button1;

    public void init(){
        Button1=(Button)findViewById(R.id.Button_Cocktails);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent change =new Intent(Main2Activity.this,MainActivity.class);
                startActivity(change);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        Spinner myspinner1 = (Spinner) findViewById(R.id.Optic1_Value);
        Spinner myspinner2 = (Spinner) findViewById(R.id.Optic2_Value);
        Spinner myspinner3 = (Spinner) findViewById(R.id.Optic3_Value);
        Spinner myspinner4 = (Spinner) findViewById(R.id.Optic4_Value);
        Spinner myspinner5 = (Spinner) findViewById(R.id.Optic5_Value);
        Spinner myspinner6 = (Spinner) findViewById(R.id.Optic6_Value);
        Spinner myspinner7 = (Spinner) findViewById(R.id.Optic7_Value);
        Spinner myspinner8 = (Spinner) findViewById(R.id.Optic8_Value);
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.SpinnerEntry) );
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner1.setAdapter(myadapter);
        myspinner2.setAdapter(myadapter);
        myspinner3.setAdapter(myadapter);
        myspinner4.setAdapter(myadapter);
        myspinner5.setAdapter(myadapter);
        myspinner6.setAdapter(myadapter);
        myspinner7.setAdapter(myadapter);
        myspinner8.setAdapter(myadapter);
    }
}

