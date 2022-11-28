package com.example.smssplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Sms();
    }

    public void Sms(){
        Button b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText t1=(EditText) findViewById(R.id.t11);
                EditText t2=(EditText) findViewById(R.id.t22);
                String ph=t1.getText().toString();
                String Sms=t2.getText().toString();
                SmsManager smsManager= SmsManager.getDefault();
                smsManager.sendTextMessage(ph,null,Sms,null, null);
                Toast.makeText(getApplicationContext(), "text send Successfully", Toast.LENGTH_SHORT).show();
                t2.setText("");
            }
        });
    }
}
