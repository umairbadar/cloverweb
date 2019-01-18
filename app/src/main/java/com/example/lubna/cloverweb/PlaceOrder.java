package com.example.lubna.cloverweb;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class PlaceOrder extends AppCompatActivity implements View.OnClickListener {
RadioButton r1,r2,r3;
Button btnplace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);
        r1 = findViewById(R.id.radiobtn1);
        r2 = findViewById(R.id.radiobtn2);
        r3 = findViewById(R.id.radiobtn3);
        btnplace = findViewById(R.id.buttonprocedecheck2);
        btnplace.setOnClickListener(this);
    }
    public void CheckValidation() {

//        if(!r1.isChecked() || !r2.isChecked())
//        {
//            r1.setError("Kindly select any option");
//        }
        if (!(r1.isChecked()) && !(r2.isChecked()) && !(r3.isChecked())) {
                        Toast.makeText(getApplicationContext(),"Kindly select any one payment method",Toast.LENGTH_LONG).show();
        }
        else if ((r2.isChecked()))
        {
            Intent i = new Intent(getApplicationContext(),Carddetails.class);
            startActivity(i);
            finish();
        }
        else if ((r1.isChecked()))
        {
            Toast.makeText(getApplicationContext(),"COD",Toast.LENGTH_LONG).show();
        }
        else if((r3.isChecked()))
        {
            Intent i = new Intent(getApplicationContext(),Ebatwa.class);
            startActivity(i);
            finish();
        }

    }
    @Override
    public void onClick(View v) {
        CheckValidation();
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(),Checkout.class);
        startActivity(i);
        finish();
    }
}
