package com.sirma.weather;


public class Reading {
    private String dateTime;
    private String city;
    private String readingType;
    private String measurement;
    private int values;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReadingType() {
        return readingType;
    }

    public void setReadingType(String readingType) {
        this.readingType = readingType;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }
}
