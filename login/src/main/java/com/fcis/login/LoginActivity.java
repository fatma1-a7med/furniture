package com.fcis.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView email=(TextView)findViewById(R.id.email);
        TextView password =(TextView) findViewById(R.id.password);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        //admin and admin loginbtn.setOnClickListener(new View.OnClickListener()
        // { @Override public void onClick(View v) { if(email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){ //correct Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show(); }else //incorrect Toast.makeText(MainActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show(); } }); }}
         }
}
