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
public class FoodFragment extends Fragment {

    private LocationDataManager ldm;

    public FoodFragment() {
        ldm = LocationDataManager.getInstance();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);
        ArrayList<Location> food = ldm.getFood();
        ListView listView = rootView.findViewById(R.id.food_list_view);
        LocationListAdapter locationAdapter = new LocationListAdapter(getActivity(), food, R.color.category_food);
        listView.setAdapter(locationAdapter);
        return rootView;
    }

}
