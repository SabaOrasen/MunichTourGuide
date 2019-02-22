package com.example.saba.tourguide;

import android.util.Log;

import java.util.Date;

public class Weather {
    int temp;
    String city;
    String description;
    String date;

    public Weather(Double temp, String city, String description, String date){
        System.out.print(temp);
        long tmp  = Math.round(temp);
        int i = (int)tmp/10;
        this.temp = i;
        this.city = city;
        this.description = description;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public int getTemp() {
        return temp;
    }
}

