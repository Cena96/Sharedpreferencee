package com.example.ashu.sharedpreference;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    public static final String DEFAULT="N/A";
    TextView usernameview,passwordview;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        usernameview=(TextView)findViewById(R.id.userview);
        passwordview=(TextView)findViewById(R.id.passview);
    }
    public void load(View view)
    {
        SharedPreferences sp=getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name=sp.getString("name",DEFAULT);
        String password=sp.getString("password",DEFAULT);
        if(name.equals(DEFAULT))
        {
            Toast.makeText(this,"No data found",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Data Loaded Successfully", Toast.LENGTH_SHORT).show();
            usernameview.setText(name);
            passwordview.setText(password);
        }

    }
    public void previous(View view)
    {
        Toast.makeText(this,"Previous", Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}

