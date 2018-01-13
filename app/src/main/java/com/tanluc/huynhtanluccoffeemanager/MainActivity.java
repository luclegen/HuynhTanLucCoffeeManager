package com.tanluc.huynhtanluccoffeemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText txtDeskNumber;
    RadioGroup radGrSelect;
    RadioButton radDeskEmpty, radDeskAvailable, radDeskCleaning,radDeskBooked;
    Button btnSaveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addControls();
        addEvents();
    }

    private void addControls() {
        txtDeskNumber = (EditText) findViewById(R.id.txtDeskNumber);

        radGrSelect = (RadioGroup) findViewById(R.id.radGrSelect);

        radDeskEmpty = (RadioButton) findViewById(R.id.radDeskEmpty);
        radDeskAvailable = (RadioButton) findViewById(R.id.radDeskCleaning);
        radDeskCleaning = (RadioButton) findViewById(R.id.radDeskCleaning);
        radDeskBooked = (RadioButton) findViewById(R.id.radDeskBooked);
        btnSaveData = (Button) findViewById(R.id.btnSaveData);
    }

    private void addEvents() {

    }
}