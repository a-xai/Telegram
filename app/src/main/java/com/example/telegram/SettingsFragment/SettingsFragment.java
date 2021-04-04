package com.example.telegram.SettingsFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.telegram.R;
import com.example.telegram.SecondFragment.CustomDialog;


public class SettingsFragment extends Fragment {
    Button getOutBtn;

   // @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        getOutBtn.setOnClickListener(v -> {
//        CustomDialog customDialog = new CustomDialog(this);
//        customDialog.show();
//        });
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        getOutBtn = view.findViewById(R.id.settings_btn2);
            getOutBtn.setOnClickListener(v -> {
                CustomDialog customDialog = new CustomDialog(this);
                customDialog.show();});

        return view;
    }
}