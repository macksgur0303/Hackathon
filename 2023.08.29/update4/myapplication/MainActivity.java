package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView; // 바텀 네비게이션 뷰
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag1 frag1;
    private Frag2 frag2;
    private Frag3 frag3;
    private Frag4 frag4;
    private Frag5 frag5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView.findViewById(R.id.bottom_na);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.action_p1) {
                    setFrag(0);
                } else if (item.getItemId() == R.id.action_p2) {
                    setFrag(1);
                } else if (item.getItemId() == R.id.action_p3) {
                    setFrag(2);
                } else if (item.getItemId() == R.id.action_p4) {
                    setFrag(3);
                } else if (item.getItemId() == R.id.action_p5) {
                    setFrag(4);
                }

                return true;
            }
        });
        frag1 = new Frag1();
        frag2 = new Frag2();
        frag3 = new Frag3();
        frag4 = new Frag4();
        frag5 = new Frag5();
        setFrag(0); // 첫 화면 지정

        /*findViewById(R.id.btn_home_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HomeActivity_2.class));
            }
        });*/
    }

    private void setFrag(int n){ // 프래그먼트 교체 발생
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n){
            case 0:
                ft.replace(R.id.main_flame, frag1);
                ft.commit();
                break;

            case 1:
                ft.replace(R.id.main_flame, frag2);
                ft.commit();
                break;

            case 2:
                ft.replace(R.id.main_flame, frag3);
                ft.commit();
                break;

            case 3:
                ft.replace(R.id.main_flame, frag4);
                ft.commit();
                break;

            case 4:
                ft.replace(R.id.main_flame, frag5);
                ft.commit();
                break;

        }
    }


}