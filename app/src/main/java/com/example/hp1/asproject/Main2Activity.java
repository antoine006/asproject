package com.example.hp1.asproject;

import android.content.Intent;
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
        ILVcountries.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long ld) {
       String selectedItem = arrayList.get(position);
        Intent i = new Intent(this, BookListActivity.class);
        if(position==0){
            i.putExtra("Category","Biography" );
        }else if(position ==1 ){
            i.putExtra("Category","Business and Finance" );
        }else if(position==2){
            i.putExtra("Category","Fiction" );
        }else if(position==3){
            i.putExtra("Category","History" );
        }
       else if (position==4){
            i.putExtra("Category","Sceince" );
        }else if (position==5){
            i.putExtra("Category","Sport" );
        }else if (position==6){
            i.putExtra("Category","Photography" );
        }
        startActivity(i);
    }
}
