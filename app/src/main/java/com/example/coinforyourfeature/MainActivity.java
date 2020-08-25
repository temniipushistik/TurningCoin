package com.example.coinforyourfeature;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.add(R.id.fragment_container,FragmentMotionless.newInstance(),"tag1");
        transaction.commit();

        (findViewById(R.id.button_turn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.add(R.id.fragment_container, TurningFragment.newInstance(), "tag2");
                transaction.commit();
            }


        });



    }


  public void change(View view) {
        Fragment fragment;
        fragment = new TurningFragment();



    }


}

