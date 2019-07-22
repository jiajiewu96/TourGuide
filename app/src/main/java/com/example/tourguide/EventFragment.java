package com.example.tourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {
    private LocationDataManager ldm;

    public EventFragment() {
        ldm = LocationDataManager.getInstance();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_event, container, false);
        ArrayList<Location> events = ldm.getEvents();
        ListView listView = rootView.findViewById(R.id.event_list_view);
        LocationListAdapter locationAdapter = new LocationListAdapter(getActivity(), events,R.color.category_event);
        listView.setAdapter(locationAdapter);
        return rootView;
    }

}
