package com.example.employeeappmzc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1;
String getEmpCode,getEmpName,getDesg,getSal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.empcode);
        ed2=(EditText) findViewById(R.id.empname);
        ed3=(EditText) findViewById(R.id.desg);
        ed4=(EditText) findViewById(R.id.empsal);
        b1=(AppCompatButton) findViewById(R.id.sub1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmpCode=ed1.getText().toString();
                getEmpName=ed2.getText().toString();
                getDesg=ed3.getText().toString();
                getSal=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getEmpCode, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getEmpName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getDesg, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getSal, Toast.LENGTH_SHORT).show();
            }
        });
    }
}