package com.example.hp1.asproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView ILVcountries;
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ILVcountries = (ListView) findViewById(R.id.LvCountries) ;
        arrayList.add("Biography");
        arrayList.add("Business and Finance");
        arrayList.add("Fiction");
        arrayList.add("History");
        arrayList.add("Sceince");
        arrayList.add("Sport");
        arrayList.add("Photography");
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,arrayList);
        ILVcountries.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long ld) {
       String selectedItem = arrayList.get(position);
        if(position==0){
        }
    }
}
