package com.tanluc.huynhtanluccoffeemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.tanluc.adapters.ServiceDeskAdapter;
import com.tanluc.models.ServiceDesk;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvServiceDesk;
    ArrayList<ServiceDesk> listServiceDesk;
    ServiceDeskAdapter adapterServiceDesk;

    EditText txtDeskNumber;
    RadioGroup radGrSelect;
    RadioButton radDeskEmpty, radDeskAvailable, radDeskCleaning,radDeskBooked;
    Button btnSaveData;
    String txtStatus;

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

        lvServiceDesk = (ListView) findViewById(R.id.lvListServiceDesk);
        listServiceDesk = new ArrayList<>();
        adapterServiceDesk = new ServiceDeskAdapter(MainActivity.this, R.layout.items, listServiceDesk);
        lvServiceDesk.setAdapter(adapterServiceDesk);
    }

    private void addEvents() {

        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processSaveData();
            }
        });
    }

    private void processSaveData() {
        ServiceDesk serviceDesk = new ServiceDesk();

        serviceDesk.setNumberName(txtDeskNumber.getText().toString() + " ");

        if (radDeskEmpty.isChecked()) {
            txtStatus = radDeskEmpty.getText().toString();
        } else if (radDeskAvailable.isChecked()) {
            txtStatus = radDeskAvailable.getText().toString();
        } else if (radDeskCleaning.isChecked()) {
            txtStatus = radDeskCleaning.getText().toString();
        } else if (radDeskBooked.isChecked()) {
            txtStatus = radDeskBooked.getText().toString();
        }

        serviceDesk.setStatus(txtStatus);

        try {
            ExceptionInInitializerError error = new ExceptionInInitializerError();
            if(serviceDesk.getNumberName().length() > 0 && serviceDesk.getNumberName().charAt(0) != ' ') {
                listServiceDesk.add(serviceDesk);
                adapterServiceDesk.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "You added " + serviceDesk.getNumberName() + " successful.", Toast.LENGTH_LONG).show();
            } else {
                throw error;
            }
        } catch (ExceptionInInitializerError error) {
            Toast.makeText(MainActivity.this, "Error: Invalid name or null name for this service desk", Toast.LENGTH_LONG).show();
        }

        txtDeskNumber.setText("");
    }
}