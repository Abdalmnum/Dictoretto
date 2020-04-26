package com.example.Dictoretto.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vezeeta.R;

public class BookActivity extends AppCompatActivity {


    private Button btnBookDoctor, btnSearchDoctor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        btnBookDoctor = findViewById(R.id.btn_book_doctor);
        btnSearchDoctor = findViewById(R.id.btn_search_doctor);


        btnBookDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent areaIntent = new Intent(BookActivity.this, AreaActivity.class);
                startActivity(areaIntent);

            }
        });


        btnSearchDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent selectIntent = new Intent(BookActivity.this, SelectDoctorActivity.class);
                startActivity(selectIntent);

            }
        });


    }//end onCreate
}
