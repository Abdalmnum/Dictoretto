package com.example.Dictoretto.Activities;

import android.os.Bundle;

import com.example.Dictoretto.Fragments.AppointmentFragment;
import com.example.Dictoretto.Fragments.MoreFragment;
import com.example.Dictoretto.Fragments.OffersFragment;
import com.example.Dictoretto.Fragments.PharmacyFragment;
import com.example.Dictoretto.Fragments.SearchFragment;
import com.example.vezeeta.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;

public class Home extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_search:

                    getSupportFragmentManager().beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.fragment_layout, new SearchFragment()).commit();


                    return true;
                case R.id.navigation_offers:

                    getSupportFragmentManager().beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.fragment_layout, new OffersFragment()).commit();

                    return true;

                case R.id.navigation_pharmacy:

                    getSupportFragmentManager().beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.fragment_layout, new PharmacyFragment()).commit();

                    return true;

                case R.id.navigation_appointment:

                    getSupportFragmentManager().beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.fragment_layout, new AppointmentFragment()).commit();

                    return true;
                case R.id.navigation_more:

                    getSupportFragmentManager().beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.fragment_layout,new MoreFragment()).commit();

                    return true;


            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_layout,new SearchFragment()).commit();


    }//end onCreate

}
