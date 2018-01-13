package com.tanluc.adapters;

import android.app.Activity;

import com.tanluc.models.ServiceDesk;

import java.util.List;

/**
 * Created by TANLUC on 13/01/2018.
 */
public class ServiceDeskAdapter {

    Activity context;               //Screen use Layout
    int resource;                   //Layout for each row
    List<ServiceDesk> objects;      //Source data

    public ServiceDeskAdapter() {
    }

    public ServiceDeskAdapter(Activity context, int resource, List<ServiceDesk> objects) {
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    public Activity getContext() {
        return context;
    }

    public void setContext(Activity context) {
        this.context = context;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public List<ServiceDesk> getObjects() {
        return objects;
    }

    public void setObjects(List<ServiceDesk> objects) {
        this.objects = objects;
    }
}
