package com.example.mad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Contact extends AppCompatActivity {

    ListView simpleListView;

    // array objects
    String ContactList[] = {"Name 1", "Name 1", "Name 1", "Name 1",
            "Name 1", "Name 1", "Name 1", "Name 1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListView = (ListView) findViewById(R.id.simpleListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.activity_contact, R.id.itemTextView, ContactList);
        simpleListView.setAdapter(arrayAdapter);
    }
}