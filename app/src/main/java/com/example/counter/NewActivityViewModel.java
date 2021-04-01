package com.example.counter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NewActivityViewModel extends ViewModel {

    private String content;
    private MutableLiveData<String> contentLiveData = new MutableLiveData<>();

    public MutableLiveData<String> getCurrentVale() {
        contentLiveData.setValue(content);
        return contentLiveData;
    }

}
