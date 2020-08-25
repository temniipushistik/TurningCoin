package com.example.coinforyourfeature;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TurningFragment extends Fragment {
    public static TurningFragment newInstance() {
        
        Bundle args = new Bundle();
        
        TurningFragment fragment = new TurningFragment();
        fragment.setArguments(args);
        return fragment;
    }

  

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_turning, container, false);
    }
}