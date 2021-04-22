package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view){
        Log.i("Info","Success");
        EditText et=(EditText)findViewById(R.id.money);
        double rupees=Double.parseDouble(et.getText().toString());
        double dollers=rupees*0.014;

        Toast.makeText(this, rupees+"₹ = "+String.format("%.2f", dollers)+"$", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}