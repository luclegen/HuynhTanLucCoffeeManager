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
                RadioButton rad = (RadioButton) radGrSelect.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.radDeskEmpty:
                        txtStatus = radDeskEmpty.getText().toString();
                        break;
                    case R.id.radDeskAvailable:
                        txtStatus = radDeskAvailable.getText().toString();
                        break;
                    case R.id.radDeskCleaning:
                        txtStatus = radDeskCleaning.getText().toString();
                        break;
                    case R.id.radDeskBooked:
                        txtStatus = radDeskBooked.getText().toString();
                        break;
                }
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

        serviceDesk.setStatus(txtStatus);

        listServiceDesk.add(serviceDesk);

        adapterServiceDesk.notifyDataSetChanged();
    }
}