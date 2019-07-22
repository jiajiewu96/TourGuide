package com.example.tourguide;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        final ArrayList<Location> events = ldm.getEvents();
        ListView listView = rootView.findViewById(R.id.event_list_view);
        LocationListAdapter locationAdapter = new LocationListAdapter(getActivity(), events,R.color.category_event);
        listView.setAdapter(locationAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Location location = events.get(i);
                String locationName = location.getName();
                String locationDescription = location.getDescription();
                int locationResInt = location.getResInt();
                String locationDate = location.getDate();

                Intent intent = new Intent(getActivity(), LocationInformationActivity.class);
                intent.putExtra("loc_name", locationName);
                intent.putExtra("loc_desc", locationDescription);
                intent.putExtra("loc_res_int", locationResInt);
                intent.putExtra("loc_date", locationDate);

                startActivity(intent);

            }
        });
        rootView.setBackgroundColor(getActivity().getResources().getColor(R.color.category_event_dark));
        return rootView;
    }

}
