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

import com.tanluc.models.ServiceDesk;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ServiceDesk> listServiceDesk;
    ArrayAdapter<ServiceDesk> adapterServiceDesk;
    ListView lvServiceDesk;

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
        listServiceDesk = new ArrayList<>();
        adapterServiceDesk = new ArrayAdapter<ServiceDesk>(MainActivity.this, android.R.layout.simple_list_item_1, listServiceDesk);
        lvServiceDesk = (ListView) findViewById(R.id.lvListServiceDesk);
        lvServiceDesk.setAdapter(adapterServiceDesk);

        txtDeskNumber = (EditText) findViewById(R.id.txtDeskNumber);

        radGrSelect = (RadioGroup) findViewById(R.id.radGrSelect);

        radDeskEmpty = (RadioButton) findViewById(R.id.radDeskEmpty);
        radDeskAvailable = (RadioButton) findViewById(R.id.radDeskCleaning);
        radDeskCleaning = (RadioButton) findViewById(R.id.radDeskCleaning);
        radDeskBooked = (RadioButton) findViewById(R.id.radDeskBooked);
        btnSaveData = (Button) findViewById(R.id.btnSaveData);
    }

    private void addEvents() {
        radGrSelect.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            }
        });

        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processSaveData();
            }
        });
    }

    private void processSaveData() {
        ServiceDesk serviceDesk = new ServiceDesk();

        serviceDesk.setNumberName(txtDeskNumber.getText().toString());

    }
}