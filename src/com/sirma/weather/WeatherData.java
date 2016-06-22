package com.sirma.weather;

import java.util.List;
import java.util.stream.Collectors;


public class WeatherData {
    private ReadingDAO dao;

    public List<Reading> getReadings() {
        return dao.getReadings();
    }

    public List<Reading> getReadingsByCity(String city) {
        return getReadings().stream().filter(r -> r.getCity().equals(city)).collect(Collectors.toList());
    }

    public void getMaxTemperatureByCity(String city) {
    }

    public void getTemperatureValuesByCity(String city) {
    }
}
