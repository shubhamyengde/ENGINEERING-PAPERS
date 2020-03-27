package com.yengde.engineeringpapers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by DELL on 2/26/2020.
 */

public class BATU extends Fragment {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v =inflater.inflate(R.layout.batu,container,false);
        btn1= v.findViewById(R.id.button11);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");
                Intent activity1Intent = new Intent(getActivity(), Cseb.class);
                startActivity(activity1Intent);


            }
        });

        btn9= v.findViewById(R.id.batu1);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");
                Intent activity22Intent = new Intent(getActivity(), mtech.class);
                startActivity(activity22Intent);
            }
        });

        btn2= v.findViewById(R.id.button12);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");
                Intent activity2Intent = new Intent(getActivity(), ITb.class);
                startActivity(activity2Intent);
            }
        });

        btn3= v.findViewById(R.id.button13);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity3Intent = new Intent(getActivity(), Mechb.class);
                startActivity(activity3Intent);


            }
        });
        btn4= v.findViewById(R.id.button14);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity4Intent = new Intent(getActivity(), Civilb.class);
                startActivity(activity4Intent);


            }
        });
        btn5= v.findViewById(R.id.button15);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity5Intent = new Intent(getActivity(), Archib.class);
                startActivity(activity5Intent);


            }
        });
        btn6= v.findViewById(R.id.button16);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity6Intent = new Intent(getActivity(), Chemb.class);
                startActivity(activity6Intent);


            }
        });
        btn7= v.findViewById(R.id.button17);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity7Intent = new Intent(getActivity(), Ectb.class);
                startActivity(activity7Intent);


            }
        });
        btn8= v.findViewById(R.id.button18);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity8Intent = new Intent(getActivity(), Eepb.class);
                startActivity(activity8Intent);


            }
        });
        btn8= v.findViewById(R.id.button19);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity8Intent = new Intent(getActivity(), FYb.class);
                startActivity(activity8Intent);


            }
        });


        return v;
    }
}

