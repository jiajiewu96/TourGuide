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
public class AttractionsFragment extends Fragment {

    private LocationDataManager ldm;

    public AttractionsFragment() {
        ldm = LocationDataManager.getInstance();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_attractions, container, false);
        ArrayList<Location> attractions = ldm.getAttractions();
        ListView listView = rootView.findViewById(R.id.attractions_list_view);
        LocationListAdapter locationAdapter = new LocationListAdapter(getActivity(), attractions, R.color.category_attractions);
        listView.setAdapter(locationAdapter);
        return rootView;
    }

}
