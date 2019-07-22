package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class LocationAdapter extends ArrayAdapter<Location> {
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.location_list_item, parent, false);
        }




        return listItemView;
    }

    public LocationAdapter(Context context, int resource) {
        super(context, resource);
    }
}
