package com.example.coinforyourfeature;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class GoingToStopFragment extends Fragment {

    public static GoingToStopFragment newInstance() {
        
        Bundle args = new Bundle();
        
        GoingToStopFragment fragment = new GoingToStopFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_going_to_stop, container, false);
    }
}