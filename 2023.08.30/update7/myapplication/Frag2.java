package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag2 extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag2, container, false);

        Button btn_ct1 = view.findViewById(R.id.btn_ct1);
        Button btn_pf5 = view.findViewById(R.id.btn_pf5);

        btn_ct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 버튼이 클릭되었을 때 동작 처리
                Intent intent = new Intent(getActivity(), CheckThicketActivity.class);
                startActivity(intent);
            }
        });

        btn_pf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 버튼이 클릭되었을 때 동작 처리

                Intent intent = new Intent(getActivity(), ProfileActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
