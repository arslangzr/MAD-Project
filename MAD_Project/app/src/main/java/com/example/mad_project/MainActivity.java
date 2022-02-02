package com.example.mad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Bluetooth, Sensor, Wifi, Contact;
        Bluetooth = findViewById(R.id.bluetooth__btn);
        Sensor = findViewById(R.id.sensor_btn);
        Wifi = findViewById(R.id.wifi_btn);
        Contact = findViewById(R.id.contact_btn);

        Bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bluetoothIntent= new Intent(MainActivity.this, Bluetooth.class);
                startActivity(bluetoothIntent);
            }
        });

        Wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wifiIntent= new Intent(MainActivity.this, Wifi.class);
                startActivity(wifiIntent);

            }
        });

        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent= new Intent(MainActivity.this, Contact.class);
                startActivity(contactIntent);

            }
        });
        Sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sensorIntent= new Intent(MainActivity.this, Sensor.class);
                startActivity(sensorIntent);

            }
        });


    }
}