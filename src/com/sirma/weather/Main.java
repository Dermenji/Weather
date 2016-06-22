package com.sirma.weather;


import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new Utility(), 10000, 10000);

        WeatherData wd = new WeatherData();

        wd.getReadingsByCity("Varna");
        wd.getTemperatureValuesByCity("Varna");
        wd.getMaxTemperatureByCity("Plovdiv");

    }
}
