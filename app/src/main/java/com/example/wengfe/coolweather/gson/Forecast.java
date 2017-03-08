package com.example.wengfe.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WengFe on 17/3/8.
 */

public class Forecast {
    public String data;
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
