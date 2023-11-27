package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class second_fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.second_fragment, container, false);


        // Retrieve data passed from the previous fragment
        Bundle bundle=getArguments();
        String fisrtname=bundle.getString("FirstName");
        String lastname=bundle.getString("LastName");

        // Initialize TextViews in the current fragment
        TextView firstText=(TextView) rootView.findViewById(R.id.firstname);
        TextView lastText=(TextView) rootView.findViewById(R.id.lastname);


        // Set the text of TextViews with the received data
        firstText.setText(fisrtname);
        lastText.setText(lastname);
        return rootView;
    }
}
