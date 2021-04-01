package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import java.io.IOException;

public class NewActivity extends AppCompatActivity {
    NewActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        viewModel = new ViewModelProvider(this).get(NewActivityViewModel.class);

    }
}