package com.example.tourguide;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_attractions);
            case 1:
                return mContext.getString(R.string.category_food);
            case 2:
                return mContext.getString(R.string.category_nature);
            case 3:
                return mContext.getString(R.string.category_events);
            default:
                return mContext.getString(R.string.category_attractions);
        }
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new NatureFragment();
            case 3:
                return new EventFragment();
            default:
                return new AttractionsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
