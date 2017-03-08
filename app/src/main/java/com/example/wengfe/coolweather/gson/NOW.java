package com.example.wengfe.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WengFe on 17/3/8.
 */

public class NOW {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;


    public class More {
        @SerializedName("txt")
        public String info;
    }
}
