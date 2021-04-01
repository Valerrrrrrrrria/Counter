package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        textView = findViewById(R.id.TextView);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("INFO", "OnStart");

        LiveData<Integer> countLivaData = viewModel.getCurrentVale();

        countLivaData.observe(this, new Observer<Integer>() {

            @Override
            public void onChanged(Integer integer) {

                textView.setText(String.valueOf(integer));

            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("INFO", "OnStop");

        viewModel.getCurrentVale().removeObservers(this);

    }

    public void newOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, NewActivity.class);
        startActivity(intent);
    }

    public void decreaseValue (View view) {
        viewModel.getDecreasedCount();
    }

    public void increaseValue (View view) {
        viewModel.getIncreasedCount();
    }

}
