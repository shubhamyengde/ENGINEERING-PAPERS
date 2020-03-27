package com.yengde.engineeringpapers;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
//import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new BAMU()).commit();
        }
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_home2:
                            selectedFragment = new BATU();
                            break;
                        case R.id.nav_home:
                            selectedFragment = new BAMU();
                            break;
                        // case R.id.action_settings:
                          //   Toast.makeText(this,"Developed By: JNEC CSE!  Published By: IT Squad Contact:shubhamyengde@gmail.com ",Toast.LENGTH_LONG).show();
                            //    return true;

                          // selectedFragment = new SearchFragment();
                         //break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };


    //@Override
    //public boolean onCreateOptionsMenu(Menu menu) {

        //MenuInflater inflater = getMenuInflater();

       // inflater.inflate(R.menu.menuitmes,menu);
        //return true;
    //}
    //@Override
    //public boolean onOptionsItemSelected(MenuItem item) {
      //  switch (item.getItemId()){
        //    case R.id.about:

          //      Toast.makeText(this,"Developed By: JNEC CSE!  Published By: IT Squad Contact:shubhamyengde@gmail.com ",Toast.LENGTH_LONG).show();
            //    return true;
        //}
        //return super.onOptionsItemSelected(item);

    }



