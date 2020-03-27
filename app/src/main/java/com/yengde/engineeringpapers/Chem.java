package com.yengde.engineeringpapers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class Chem extends AppCompatActivity {

    GridView pdfListView12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        pdfListView12 = (GridView) findViewById(R.id.myPDFList10);
        String[] pdfFiles = {"CHEM SY","CHEM TY","CHEM BE"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pdfFiles) {
            @NonNull
            @Override
            public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };


        pdfListView12.setAdapter(adapter);
        pdfListView12.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = pdfListView12.getItemAtPosition(i).toString();
                Intent start = new Intent(getApplicationContext(), PDFOpener.class);
                start.putExtra("pdfFileName", item);
                startActivity(start);
            }
        });
    }

}