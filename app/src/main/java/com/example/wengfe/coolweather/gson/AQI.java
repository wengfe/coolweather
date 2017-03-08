package com.example.wengfe.coolweather.gson;

/**
 * Created by WengFe on 17/3/8.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
