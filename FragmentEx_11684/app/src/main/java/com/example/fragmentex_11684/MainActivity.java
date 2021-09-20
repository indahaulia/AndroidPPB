package com.example.fragmentex_11684;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button FirstFragment, SecondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment = (Button) findViewById(R.id.FirstFragment);
        SecondFragment = (Button) findViewById(R.id.SecondFragment);

        FirstFragment.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View view){
                loadFragment(new FirstFragment());
            }
        });

        SecondFragment.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View view){
                loadFragment(new SecondFragment());
            }
        });
    }

    private void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit();
    }
}