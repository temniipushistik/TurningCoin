package com.example.coinforyourfeature;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class GoingToStopFragment extends Fragment {


    TextView textViewCounter;
    int count = 0;

    public static GoingToStopFragment newInstance() {

        Bundle args = new Bundle();

        GoingToStopFragment fragment = new GoingToStopFragment();
        fragment.setArguments(args);

        return fragment;
    }

    //counter for stopping the coin during 3 seconds

   /* public void content() {
        if (count < 3) {
            count++;
            textViewCounter.setText(count);
            refresh(1000);
        } else {
            //todo write cod about changing to FragmentMotionless
            textViewCounter.setText("I have finished");
        }

    }

    //creating the thread for counter and delaying it
    public void refresh(int milliseconds) {
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                content();
            }
        };
        handler.postDelayed(runnable, milliseconds);

    }

    */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     //   textViewCounter = getView().findViewById(R.id.text_counter);
       // content();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_going_to_stop, container, false);
    }
}