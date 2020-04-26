package com.example.Dictoretto.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.Dictoretto.Activities.AboutUS;
import com.example.Dictoretto.Activities.CallUS;
import com.example.Dictoretto.Activities.Login;
import com.example.Dictoretto.Activities.Setting;
import com.example.vezeeta.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoreFragment extends Fragment {


    private TextView tvSettings, tvCallUs, tvAboutUs, tvLogout;

    public MoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View moreView =  inflater.inflate(R.layout.fragment_more, container, false);


        tvSettings = moreView.findViewById(R.id.tv_setting);
        tvCallUs = moreView.findViewById(R.id.tv_contact_us);
        tvAboutUs = moreView.findViewById(R.id.tv_about_us);
        tvLogout = moreView.findViewById(R.id.tv_logout);


        tvSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent settingIntent = new Intent(getContext(), Setting.class);
                startActivity(settingIntent);

            }
        });


        tvCallUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(getContext(), CallUS.class);
                startActivity(callIntent);

            }
        });


        tvAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent aboutIntent = new Intent(getContext(), AboutUS.class);
                startActivity(aboutIntent);

            }
        });


        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent aboutIntent = new Intent(getContext(), Login.class);
                startActivity(aboutIntent);

            }
        });






        return moreView;


    }//end onCreateView

}
