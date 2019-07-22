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

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class LocationListAdapter extends ArrayAdapter<Location> {
    private int mColor;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.location_list_item, parent, false);
        }

        Location location = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.location_date);
        ImageView locationImageView = (ImageView) listItemView.findViewById(R.id.location_thumbnail);

        nameTextView.setText(location.getName());
        if (!location.hasDate()) {
            dateTextView.setVisibility(View.GONE);
        } else {
            dateTextView.setText(location.getDate());
        }
        if (!location.hasImage()) {
            locationImageView.setVisibility(View.GONE);
            //adjust parameters if there are no images
            adjustMargins(nameTextView);
        } else {
            locationImageView.setImageResource(location.getResInt());
        }
        int color = ContextCompat.getColor(getContext(), mColor);
        listItemView.setBackgroundColor(color);

        return listItemView;
    }

    private void adjustMargins(TextView nameTextView) {
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) nameTextView.getLayoutParams();
        int newMarginInDP = 16;
        int newMarginInPX = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, newMarginInDP, getContext().getResources().getDisplayMetrics());
        params.topMargin = newMarginInPX;
        params.leftMargin = newMarginInPX;
        nameTextView.setLayoutParams(params);
    }

    public LocationListAdapter(Context context, ArrayList<Location> locations, int colorResourceID) {
        super(context, 0, locations);
        mColor = colorResourceID;
    }
}
