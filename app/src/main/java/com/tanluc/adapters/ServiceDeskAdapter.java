package com.tanluc.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;

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
}
