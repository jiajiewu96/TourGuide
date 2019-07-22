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
        final ArrayList<Location> attractions = ldm.getAttractions();
        ListView listView = rootView.findViewById(R.id.attractions_list_view);
        LocationListAdapter locationAdapter = new LocationListAdapter(getActivity(), attractions, R.color.category_attractions);
        listView.setAdapter(locationAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Location location = attractions.get(i);
                String locationName = location.getName();
                String locationDescription = location.getDescription();
                int locationResInt = location.getResInt();
                String locationDate = location.getDate();
                int backgroundColorResID = getActivity().getResources().getColor(R.color.category_attractions_dark);

                Intent intent = new Intent(getActivity(), LocationInformationActivity.class);
                intent.putExtra("loc_name", locationName);
                intent.putExtra("loc_desc", locationDescription);
                intent.putExtra("loc_res_int", locationResInt);
                intent.putExtra("loc_date", locationDate);
                intent.putExtra("loc_bg_color", backgroundColorResID);

                startActivity(intent);

            }
        });
        rootView.setBackgroundColor(getActivity().getResources().getColor(R.color.category_attractions_dark));

        return rootView;
    }

}
