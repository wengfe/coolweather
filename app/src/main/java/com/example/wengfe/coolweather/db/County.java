package com.example.wengfe.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by WengFe on 17/3/7.
 */

public class County extends DataSupport {
    private int id;
    private String conutyName;
    private int weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConutyName() {
        return conutyName;
    }

    public void setConutyName(String conutyName) {
        this.conutyName = conutyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
