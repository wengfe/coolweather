package com.example.wengfe.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by WengFe on 17/3/7.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
