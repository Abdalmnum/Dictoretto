package com.example.Dictoretto.Activities;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vezeeta.R;

public class Register extends AppCompatActivity {
    TextView View_Login_Register,Register_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        View_Login_Register = (TextView)findViewById(R.id.view_login_register);
        Register_user= (TextView)findViewById(R.id.register_user);
        View_Login_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        });
        Register_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,Register_User.class);
                startActivity(intent);
            }
        });
    }
}
