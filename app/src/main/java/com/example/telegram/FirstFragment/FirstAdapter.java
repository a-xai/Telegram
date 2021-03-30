package com.example.telegram.FirstFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.telegram.R;

import java.util.ArrayList;
import java.util.List;

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.FirstViewHolder> {
    private List<ItemModelForFirstFragment> list = new ArrayList<>();

    private onClickViewHolder listener;

    public FirstAdapter(onClickViewHolder listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public FirstViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_chat,parent,false);
        return new FirstViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FirstViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public void adding(ItemModelForFirstFragment itemModelForFirstFragment){
        list.add(itemModelForFirstFragment);
        notifyDataSetChanged();
    }

    class FirstViewHolder extends RecyclerView.ViewHolder{
        private TextView chatName, lastMessage;

        public FirstViewHolder(@NonNull View itemView) {
            super(itemView);
            chatName = itemView.findViewById(R.id.item_user_name_txt);
            lastMessage = itemView.findViewById(R.id.item_chat_last_massage_txt);
        }

        public void onBind(ItemModelForFirstFragment itemModelForFirstFragment) {
            chatName.setText(itemModelForFirstFragment.getChatName());
            lastMessage.setText(itemModelForFirstFragment.getLastMessage());
            itemView.setOnClickListener(v -> listener.onClick(itemModelForFirstFragment));
        }
    }

    interface onClickViewHolder {
        void onClick(ItemModelForFirstFragment itemModelForFirstFragment);
    }
}
