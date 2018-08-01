package com.ptp.phamtanphat.fragmentpopbackstack0405;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
        fragmentTransaction.add(R.id.relativelayout,fragmentAndroid,"fragmentAndroid");
        fragmentTransaction.commit();
    }
    public void Addios(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragmentios fragmentios = new Fragmentios();
        fragmentTransaction.add(R.id.relativelayout,fragmentios,"fragmentios");
        fragmentTransaction.commit();
    }
    public void ReplaceAndroid(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentAndroid fragmentAndroid = new FragmentAndroid();
        fragmentTransaction.replace(R.id.relativelayout,fragmentAndroid);
        fragmentTransaction.commit();
    }
    public void Replaceios(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragmentios fragmentios = new Fragmentios();
        fragmentTransaction.replace(R.id.relativelayout,fragmentios);
        fragmentTransaction.commit();
    }

    public void RemoveAndroid(View v){
        FragmentAndroid fragmentAndroid = (FragmentAndroid) getSupportFragmentManager().findFragmentByTag("fragmentAndroid");
        if (fragmentAndroid != null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(fragmentAndroid);
            fragmentTransaction.commit();
        }else {
            Toast.makeText(this, "Khong fragment android", Toast.LENGTH_SHORT).show();
        }
    }
}
