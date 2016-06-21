package com.sirma.weather;

import java.util.List;
import java.util.stream.Collectors;


public class WeatherData {
    private ReadingDAO dao;

    public void setMeasurements(String file) {
        Reading read = new Reading();
        read.setDateTime();
        read.setCity();
        read.setMeasurement();
        read.setReadingType();
        read.setValues();

        dao.addReading(read);
    }

    public List<Reading> getReadings() {
        return dao.getReadings();
    }

    public List<Reading> getReadingsByCity(String city) {
        return getReadings().stream().filter(r -> r.getCity().equals(city)).collect(Collectors.toList());
    }


}
