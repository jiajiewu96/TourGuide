package com.example.tourguide;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.location_list_item, parent, false);
        }

        Location location = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.location_date);
        ImageView locationImageView = (ImageView) listItemView.findViewById(R.id.location_thumbnail);

        nameTextView.setText(location.getName());
        if(!location.hasDate()){
            dateTextView.setVisibility(View.GONE);
        }else{
            dateTextView.setText(location.getDate());
        }
        if(!location.hasImage()){
            locationImageView.setVisibility(View.GONE);
            //adjust parameters if there are no images
            adjustMargins(nameTextView);
        }else {
            locationImageView.setImageResource(location.getResInt());
        }

        return listItemView;
    }

    private void adjustMargins(TextView nameTextView) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        int newLeftMarginInDP = 16;
        int newLeftMarginInPX = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, newLeftMarginInDP, getContext().getResources().getDisplayMetrics());
        params.setMargins(newLeftMarginInPX, newLeftMarginInPX,0,0);
        nameTextView.setLayoutParams(params);
    }

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }
}
