package com.yengde.engineeringpapers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BAMU extends Fragment {

    //A private static final android.R.attr R = ;
    Button btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v =inflater.inflate(R.layout.bamu,container,false);
        btn11= v.findViewById(R.id.button21);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");
                Intent activity1Intent = new Intent(getActivity(), Cse.class);
                startActivity(activity1Intent);


            }
        });

        btn12= v.findViewById(R.id.button22);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");
                Intent activity2Intent = new Intent(getActivity(), IT.class);
                startActivity(activity2Intent);
            }
        });
        btn14= v.findViewById(R.id.button24);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity4Intent = new Intent(getActivity(), Civil.class);
                startActivity(activity4Intent);


            }
        });
        btn15= v.findViewById(R.id.button25);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity5Intent = new Intent(getActivity(), Archi.class);
                startActivity(activity5Intent);


            }
        });
        btn16= v.findViewById(R.id.button26);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity6Intent = new Intent(getActivity(), FY.class);
                startActivity(activity6Intent);


            }
        });
       btn17= v.findViewById(R.id.button31);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity7Intent = new Intent(getActivity(), Ect.class);
                startActivity(activity7Intent);


            }
        });
        btn19= v.findViewById(R.id.button30);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity7Intent = new Intent(getActivity(), Mech.class);
                startActivity(activity7Intent);


            }
        });
        btn18= v.findViewById(R.id.button28);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity8Intent = new Intent(getActivity(), Eep.class);
                startActivity(activity8Intent);


            }
        });
        btn15= v.findViewById(R.id.button27);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity8Intent = new Intent(getActivity(), Chem.class);
                startActivity(activity8Intent);


            }
        });
        btn13= v.findViewById(R.id.button25);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");

                Intent activity8Intent = new Intent(getActivity(), Archi.class);
                startActivity(activity8Intent);


            }
        });


        return v;
    }
}


