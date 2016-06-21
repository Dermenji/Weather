package com.sirma.weather;


public class WeatherData {

    private ReadingDAO dao;

    public void importData(String file){
        Reading read = new Reading();
        read.setDateTime();
        read.setCity();
        read.setMeasurement();
        read.setReadingType();
        read.setValues();

        dao.addReading(read);
    }



}
