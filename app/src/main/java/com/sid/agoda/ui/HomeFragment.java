package com.sid.agoda.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sid.agoda.R;

/**
 * Created by Saurabhk on 21/12/2016.
 */

public class HomeFragment extends Fragment{

    public HomeFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.home,container,false);
        return view;
        //return inflater.inflate(R.layout.home, container, false);
    }


}
