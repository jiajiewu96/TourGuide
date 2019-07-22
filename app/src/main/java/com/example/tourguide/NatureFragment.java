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
public class NatureFragment extends Fragment {
    private LocationDataManager ldm;

    public NatureFragment() {
        ldm = LocationDataManager.getInstance();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_nature, container, false);
        ArrayList<Location> nature = ldm.getNature();
        ListView listView = rootView.findViewById(R.id.nature_list_view);
        LocationListAdapter locationAdapter = new LocationListAdapter(getActivity(), nature, R.color.category_nature);
        listView.setAdapter(locationAdapter);
        return rootView;
    }

}
