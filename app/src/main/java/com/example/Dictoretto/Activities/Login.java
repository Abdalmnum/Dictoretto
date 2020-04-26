package com.example.Dictoretto.Activities;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vezeeta.R;

public class Login extends AppCompatActivity {
    TextView Forget_Pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Forget_Pass = (TextView)findViewById(R.id.forget_pass);

        Forget_Pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Forgetpassword.class);
                startActivity(intent);
            }
        });

    }
}
