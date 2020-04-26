package com.example.Dictoretto.Activities;



import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vezeeta.R;

import java.util.Calendar;

public class Register_User extends AppCompatActivity {
    private static final String TAG ="Register_User";
    EditText DateOfBirth;
    Button Butt_Date;

    private DatePickerDialog.OnDateSetListener mdateSetListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__user);

        DateOfBirth = (EditText)findViewById(R.id.date);
        Butt_Date = (Button)findViewById(R.id.butt_date);

        Butt_Date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal =Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                int month = cal.get(Calendar.MONTH);
                DatePickerDialog dialog =new DatePickerDialog(Register_User.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,mdateSetListener,day,month,year);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        mdateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month+1;
                Log.d(TAG, "onDateSet: " + day + "/"+month + "/"+ year );
                String Date = day + "/" + month + "/"+ year;
                DateOfBirth.setText(Date);
            }
        };


    }
}
