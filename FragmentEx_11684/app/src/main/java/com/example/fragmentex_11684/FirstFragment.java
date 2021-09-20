package com.example.fragmentex_11684;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    View view;
    Button FirstButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_first, container, false);
        FirstButton = (Button) view.findViewById(R.id.FirstButton);
        FirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Fragment Pertama", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
