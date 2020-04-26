package com.example.Dictoretto.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.Dictoretto.Activities.BookActivity;
import com.example.vezeeta.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    private Button btnBook, btnService, btnCall;


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View searchView = inflater.inflate(R.layout.fragment_search, container, false);

        btnBook = searchView.findViewById(R.id.btn_book);
        btnCall = searchView.findViewById(R.id.btn_call);
        btnService = searchView.findViewById(R.id.btn_service);


        //Intent groupChatIntent = new Intent(getContext(), GroupChatActivity.class);

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bookIntent = new Intent(getContext(), BookActivity.class);
                startActivity(bookIntent);

            }
        });


        btnService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent bookIntent = new Intent(getActivity(), OffersFragment.class);
                //startActivity(bookIntent);

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_layout, new OffersFragment());
                transaction.addToBackStack(null);
                transaction.commit();

//                getSupportFragmentManager().beginTransaction()
//                        .addToBackStack(null)
//                        .replace(R.id.fragment_layout, new AppointmentFragment()).commit();


            }
        });




        return searchView;

    }//end onCreateView

}
