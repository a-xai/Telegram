package com.example.telegram.SecondFragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.telegram.R;

public class CustomDialog extends Dialog  {
    private Button yes, no;
    public Fragment fragment;

    public CustomDialog(@NonNull Fragment fragment) {
        super(fragment.getContext());
        this.fragment = fragment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);
        yes = findViewById(R.id.positive_btn);
        no = findViewById(R.id.negative_btn);

        clickListeners();
    }

    private void clickListeners() {
        yes.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            fragment.startActivity(intent);
        });
        no.setOnClickListener(v -> {
            dismiss();
        });
    }
}
