package com.example.han.boostcamp1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Han on 2017-07-05.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private int count;

    public ViewPagerAdapter(FragmentManager fm,int count) {
        super(fm);
        this.count = count;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0 : return new MainFragment();

            case 1: return new SecondFragment();

            default: return new OtherFragment();

        }


    }

    @Override
    public int getCount() {
        return count;
    }
}
