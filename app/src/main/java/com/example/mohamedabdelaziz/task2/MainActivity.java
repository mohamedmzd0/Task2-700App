package com.example.mohamedabdelaziz.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1 ,spinner2 ;
    ArrayList<String> list1 ,list2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1= (Spinner) findViewById(R.id.spinner1) ;
        spinner2= (Spinner) findViewById(R.id.spinner2) ;
        list1=new ArrayList<>() ;
        list2=new ArrayList<>() ;
        list1.add("الامارات العربيه المتحده");
        list1.add("الامارات العربيه المتحده");
        list1.add("الامارات العربيه المتحده");
        list1.add("الامارات العربيه المتحده");
        list1.add("الامارات العربيه المتحده");
        list1.add("الامارات العربيه المتحده");
        list2.add("ابو ظبي");
        list2.add("ابو ظبي");
        list2.add("ابو ظبي");
        list2.add("ابو ظبي");
        spinner1.setAdapter(new spinnerAdapter(list1,getApplicationContext()));
        spinner2.setAdapter(new spinnerAdapter(list2,getApplicationContext()));
    }

    public void finsh(View view) {finish();
    }
}
