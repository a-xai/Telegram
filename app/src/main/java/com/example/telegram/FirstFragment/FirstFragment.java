package com.example.telegram.FirstFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.telegram.R;
import com.example.telegram.SecondFragment.SecondFragment;

public class FirstFragment extends Fragment {
    private FirstAdapter firstAdapter;
    private RecyclerView rvList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        firstAdapter = new FirstAdapter(itemModelForFirstFragment -> {
            SecondFragment fragment = new SecondFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("avatar", itemModelForFirstFragment.getAvatar());
            bundle.putString("chatName", itemModelForFirstFragment.getChatName());
            bundle.putString("lastMessage", itemModelForFirstFragment.getLastMessage());
            bundle.putBoolean("isRead", itemModelForFirstFragment.getRead());
            fragment.setArguments(bundle);

            this.getFragmentManager().beginTransaction().replace(R.id.firs_fragment_container, fragment).commit();
        });
        rvList = view.findViewById(R.id.rv_list_for_firstFragment);
        rvList.setAdapter(firstAdapter);
        setRvList();
        return view;
    }
    public void setRvList(){
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"name","hey",true));
        firstAdapter.adding(new ItemModelForFirstFragment(R.drawable.avatar,"nameq","heyhgjhvjh",true));
    }
}