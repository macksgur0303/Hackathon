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

public class Frag1 extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);

        Button btn_page1 = view.findViewById(R.id.btn_page1);
        Button btn_page_pf1 = view.findViewById(R.id.btn_page_pf1);

        btn_page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 버튼이 클릭되었을 때 동작 처리

                Intent intent = new Intent(getActivity(), HomeActivity_2.class);
                startActivity(intent);
            }
        });

        btn_page_pf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 버튼이 클릭되었을 때 동작 처리

                Intent intent = new Intent(getActivity(), ProfileActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
