package com.example.lubna.cloverweb;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Edit_address extends Fragment {
TextView text1,text2,text3,text4;
View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmenteditaddress, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        text1 = view.findViewById(R.id.address1);
        text2 = view.findViewById(R.id.city1);
        text3 = view.findViewById(R.id.province1);
        text4 = view.findViewById(R.id.country1);

    }
}
