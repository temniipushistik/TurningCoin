package com.example.coinforyourfeature;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentMotionless extends Fragment {
    public static FragmentMotionless newInstance() {

        Bundle args = new Bundle();

        FragmentMotionless fragment = new FragmentMotionless();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.motionless_fragment, container, false);
    }
}