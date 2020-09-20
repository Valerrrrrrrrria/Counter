package com.example.counter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int count;
    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public void getDecreasedCount() {
        --count;
        countLiveData.setValue(count);
    }

    public void getIncreasedCount() {
         ++count;
        countLiveData.setValue(count);
    }

    public MutableLiveData<Integer> getCurrentVale() {
        countLiveData.setValue(count);
        return countLiveData;
    }
}
