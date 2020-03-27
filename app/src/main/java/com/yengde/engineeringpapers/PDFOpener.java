package com.yengde.engineeringpapers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.WindowManager;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {
    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);
       // getSupportActionBar().setTitle("PDFs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

//to avoid capture screen shot
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        setContentView(R.layout.activity_pdfopener);
        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);
        String getItem = getIntent().getStringExtra("pdfFileName");




        if (getItem.equals("ARCH-FY")){

            myPDFViewer.fromAsset("ARCH-FY.pdf").load();

        }
        if (getItem.equals("ARCH-SY-TY")){

            myPDFViewer.fromAsset("ARCH-SYTY.pdf").load();

        }

        if (getItem.equals("M-ARCHI")){

            myPDFViewer.fromAsset("M-ARCH.pdf").load();

        }

        if (getItem.equals("M-CSE")){


            myPDFViewer.fromAsset("M-CSE.pdf").load();

        }

        if (getItem.equals("M-ECT")){

            myPDFViewer.fromAsset("M-ECT.pdf").load();

        }

        if (getItem.equals("M-EPS")){

            myPDFViewer.fromAsset("M-EPS.pdf").load();

        }

        if (getItem.equals("M-MFG")){

            myPDFViewer.fromAsset("M-MFG.pdf").load();

        }

        if (getItem.equals("M-STRU")){

            myPDFViewer.fromAsset("M-STRU.pdf").load();

        }

        if (getItem.equals("CSE-SY")){

            myPDFViewer.fromAsset("CSE-SY.pdf").load();

        }

        if (getItem.equals("CSE-TY")){

            myPDFViewer.fromAsset("CSE-TY.pdf").load();

        }

        if (getItem.equals("CSE-BE")){

            myPDFViewer.fromAsset("CSE-BE.pdf").load();

        }

        if (getItem.equals("CIVIL-SY")){

            myPDFViewer.fromAsset("CIVIL-SY.pdf").load();

        }

        if (getItem.equals("CIVIL-TY")){

            myPDFViewer.fromAsset("CIVIL-TY.pdf").load();

        }

        if (getItem.equals("CHEM-SY")){
            //  Toast.makeText(this,"Data Missing", Toast.LENGTH_SHORT).show();

            myPDFViewer.fromAsset("CHEM-SY.pdf").load();

        }

        if (getItem.equals("CHEM-TY")){

            myPDFViewer.fromAsset("CHEM-TY.pdf").load();

        }

        if (getItem.equals("ECT-SY")){
            //Toast.makeText(this,"Data Missing", Toast.LENGTH_SHORT).show();

            myPDFViewer.fromAsset("ECT-SY.pdf").load();

        }

        if (getItem.equals("ECT-TY")){

            myPDFViewer.fromAsset("ECT-TY.pdf").load();

        }

        if (getItem.equals("EEP-SY")){
            // Toast.makeText(this,"COMING SOON", Toast.LENGTH_SHORT).show();

            myPDFViewer.fromAsset("EEP-SY.pdf").load();

        }

        if (getItem.equals("EEP-TY")){

            myPDFViewer.fromAsset("EEP-TY.pdf").load();

        }

        if (getItem.equals("FY-ALL")){

            myPDFViewer.fromAsset("FY-ALL.pdf").load();

        }

        if (getItem.equals("SY-ALL")){
            //  Toast.makeText(this,"COMING SOON", Toast.LENGTH_SHORT).show();

            myPDFViewer.fromAsset("SY-ALL.pdf").load();

        }

        if (getItem.equals("IT-SY")){
            // Toast.makeText(this,"Data Missing", Toast.LENGTH_SHORT).show();

            myPDFViewer.fromAsset("IT-SY.pdf").load();

        }

        if (getItem.equals("IT-TY")){
            //  Toast.makeText(this,"COMING SOON", Toast.LENGTH_SHORT).show();

            myPDFViewer.fromAsset("IT-TY.pdf").load();

        }

        if (getItem.equals("MECH-SY")){
            //Toast.makeText(this,"Data Missing", Toast.LENGTH_SHORT).show();

            myPDFViewer.fromAsset("MECH-SY.pdf").load();

        }
        //***************class syllabus*************
        if (getItem.equals("MECH-TY")){

            myPDFViewer.fromAsset("MECH-TY.pdf").load();

        }

        if (getItem.equals("CSE SY")){

            myPDFViewer.fromAsset("CSE SY.pdf").load();

        }
        if (getItem.equals("CSE TY")){

            myPDFViewer.fromAsset("CSE TY.pdf").load();


        }

        //************class time table**********

        if (getItem.equals("CSE BE")){

            myPDFViewer.fromAsset("CSE BE.pdf").load();

        }
        if (getItem.equals("IT TY")){

            myPDFViewer.fromAsset("IT BE.pdf").load();

        }
        if (getItem.equals("IT BE")){

            myPDFViewer.fromAsset("IT BE.pdf").load();

        }
        if (getItem.equals("CIVIL SY")){

            myPDFViewer.fromAsset("CIVIL SY.pdf").load();

        }
        if (getItem.equals("CIVIL TY")){

            myPDFViewer.fromAsset("CIVIL TY.pdf").load();

        }
        if (getItem.equals("CIVIL BE")){

            myPDFViewer.fromAsset("CIVIL BE.pdf").load();

        }
        //*****************LAB TIME TABLE **********

        if (getItem.equals("ARCH FY")){

            myPDFViewer.fromAsset("ARCH FY.pdf").load();

        }
        if (getItem.equals("ARCH SY")){
            myPDFViewer.fromAsset("ARCH SY.pdf").load();
        }
        if (getItem.equals("ARCH TY")){
            myPDFViewer.fromAsset("ARCH TY.pdf").load();
        }
        if (getItem.equals("ARCH FOURTH")){
            myPDFViewer.fromAsset("ARCH FOURTH.pdf").load();
        }
        if (getItem.equals("ARCH FIFTH")){
            myPDFViewer.fromAsset("ARCH FIFTH.pdf").load();
        }
        if (getItem.equals("FY ALL")){
            myPDFViewer.fromAsset("FY ALL.pdf").load();
        }
        if (getItem.equals("SY ALL")){
            myPDFViewer.fromAsset("SY ALL.pdf").load();
        }
        if (getItem.equals("CHEM SY")){
              myPDFViewer.fromAsset("CHEM SY.pdf").load();
            //Toast.makeText(this,"PROJECT LAB FREE FOR ACTIVITY", Toast.LENGTH_SHORT).show();
        }
        if (getItem.equals("CHEM TY")){
            myPDFViewer.fromAsset("CHEM TY.pdf").load();
        }
        if (getItem.equals("CHEM BE")){
            myPDFViewer.fromAsset("CHEM BE.pdf").load();
        }



        //********CLASS TEST invigilation**********
        if (getItem.equals("EEP SY")){
            // Toast.makeText(this,"data missing", Toast.LENGTH_SHORT).show();
            myPDFViewer.fromAsset("EEP SY.pdf").load();
        }
        if (getItem.equals("EEP TY")){
            // Toast.makeText(this,"data missing", Toast.LENGTH_SHORT).show();
            myPDFViewer.fromAsset("EEP TY.pdf").load();
        }
        if (getItem.equals("EEP BE")){
            // Toast.makeText(this,"data missing", Toast.LENGTH_SHORT).show();
            myPDFViewer.fromAsset("EEP BE.pdf").load();
        }


        //class test time table
        if (getItem.equals("ECT SY")){
            //Toast.makeText(this,"COMING SOON", Toast.LENGTH_SHORT).show();
             myPDFViewer.fromAsset("ETC SY.pdf").load();
        }
        if (getItem.equals("ECT TY")){
            //Toast.makeText(this,"COMING SOON", Toast.LENGTH_SHORT).show();
             myPDFViewer.fromAsset("ETC TY.pdf").load();
        }
        if (getItem.equals("ECT BE")){
            // Toast.makeText(this,"COMING SOON", Toast.LENGTH_SHORT).show();
            myPDFViewer.fromAsset("ETC BE.pdf").load();
        }
        if (getItem.equals("MECH SY")){
            //Toast.makeText(this,"COMING SOON", Toast.LENGTH_SHORT).show();
            myPDFViewer.fromAsset("MECH SY.pdf").load();
        }
        if (getItem.equals("MECH TY")){
            //Toast.makeText(this,"COMING SOON", Toast.LENGTH_SHORT).show();
            myPDFViewer.fromAsset("MECH TY.pdf").load();
        }
        if (getItem.equals("MECH BE")){
            //Toast.makeText(this,"COMING SOON", Toast.LENGTH_SHORT).show();
            myPDFViewer.fromAsset("MECH BE.pdf").load();
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}


