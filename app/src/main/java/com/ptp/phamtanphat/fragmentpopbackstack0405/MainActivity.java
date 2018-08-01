package com.ptp.phamtanphat.fragmentpopbackstack0405;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void AddAndroid(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentAndroid fragmentAndroid = new FragmentAndroid();
        fragmentTransaction.add(R.id.relativelayout,fragmentAndroid);
        fragmentTransaction.commit();
    }
    public void Addios(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragmentios fragmentios = new Fragmentios();
        fragmentTransaction.add(R.id.relativelayout,fragmentios);
        fragmentTransaction.commit();
    }
}
