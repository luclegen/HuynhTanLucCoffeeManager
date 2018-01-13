package com.tanluc.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tanluc.huynhtanluccoffeemanager.R;
import com.tanluc.models.ServiceDesk;

import java.util.List;

/**
 * Created by TANLUC on 13/01/2018.
 */
public class ServiceDeskAdapter extends ArrayAdapter<ServiceDesk> {

    Activity context;               //Screen use Layout
    int resource;                   //Layout for each row
    List<ServiceDesk> objects;      //Source data

    public ServiceDeskAdapter(Activity context, int resource, List<ServiceDesk> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater(); //LayoutInflater: a class to build become Java code

        View row = inflater.inflate(this.resource, null);

        TextView txtNumberName = (TextView) row.findViewById(R.id.txtNumberName);
        TextView txtStatus = (TextView) row.findViewById(R.id.txtStatus);

        ServiceDesk serviceDesk = this.objects.get(position);

        txtNumberName.setText(serviceDesk.getNumberName());
        txtStatus.setText(serviceDesk.getStatus());

        return row;
    }
}
