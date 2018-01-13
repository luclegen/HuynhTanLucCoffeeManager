package com.tanluc.huynhtanluccoffeemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText txtDeskNumber;
    RadioGroup radGrSelect;
    RadioButton radDeskEmpty, radDeskAvailable, radDeskCleaning,radDeskBooked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}