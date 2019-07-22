package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LocationInformationActivity extends AppCompatActivity {
    private final int NO_RES_ID = -1;
    private final String NO_DATE_STRING = "";

    private String mLocationName = "";
    private String mLocationDescription = "";
    private int mLocationResID = NO_RES_ID;
    private String mLocationDate = NO_DATE_STRING;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_information);

        Bundle extras = getIntent().getExtras();

        getLocationInfoFromBundle(extras);

        setupLocationInfo();
    }

    private void setupLocationInfo() {
        TextView locationNameTextView = (TextView) findViewById(R.id.location_information_name);
        TextView locationDescriptionTextView = (TextView) findViewById(R.id.locaiton_information_description);
        TextView locationDateTextView = (TextView) findViewById(R.id.location_information_date);
        ImageView locationThumb = (ImageView) findViewById(R.id.location_information_thumbnail);
        //Check for date string
        if(mLocationDate.equals(NO_DATE_STRING)){
            locationDateTextView.setVisibility(View.GONE);
        }
        else {
            locationDateTextView.setText(mLocationDate);
        }
        //check if there is a thumbnail available
        if(mLocationResID == NO_RES_ID){
            locationThumb.setVisibility(View.GONE);

        }else{
            locationThumb.setImageResource(mLocationResID);
        }
        locationNameTextView.setText(mLocationName);
        locationDescriptionTextView.setText(mLocationDescription);

    }

    private void getLocationInfoFromBundle(Bundle extras) {
        if(extras != null) {
            mLocationName = extras.getString("loc_name");
            mLocationDescription = extras.getString("loc_desc");
            mLocationResID = extras.getInt("loc_res_int");
            mLocationDate = extras.getString("loc_date");
        }
    }
}
