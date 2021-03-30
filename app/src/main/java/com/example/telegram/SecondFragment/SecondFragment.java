package com.example.telegram.SecondFragment;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.telegram.FirstFragment.ItemModelForFirstFragment;
import com.example.telegram.R;

public class SecondFragment extends Fragment {
    private int avatar2;
    private TextView chatName2, lastMessage2;
    private boolean isRead;
    String e;
    String f;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_second, container, false);
        lastMessage2 = view.findViewById(R.id.second_fragment_last_message);
        chatName2 = view.findViewById(R.id.second_fragment_chat_name);
        chatName2.setText(e);
        lastMessage2.setText(f);

        return view;
    }

    private int getText(String f) {
        return getText(f);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle bundle = getArguments();

        if (bundle != null) {
            int d = bundle.getInt("avatar");
            e = bundle.getString("chatName");
            f = bundle.getString("lastMessage");
            boolean c = bundle.getBoolean("isRead");
        }
        super.onCreate(savedInstanceState);

    }
}