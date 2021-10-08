package com.tika.app2.Bluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tika.app2.R;

import android.content.Intent;

import android.view.View;
import android.widget.Button;

public class Actions extends AppCompatActivity {


    public Button btnSendData, btnReceiveData;
    public String address = null;
    public static String EXTRA_ADDRESS = "device_address";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        address="00:21:13:01:14:D1";
        setContentView(R.layout.activity_actions);

        btnSendData = (Button)findViewById(R.id.BTN_sendData);
        btnReceiveData = (Button)findViewById(R.id.BTN_receiveData);

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Actions.this, PinControl.class);

                i.putExtra(EXTRA_ADDRESS, address);
                startActivity(i);
            }
        });

        btnReceiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Actions.this, Receiver.class);

                i.putExtra(EXTRA_ADDRESS, address);
                startActivity(i);
            }
        });

    }

}