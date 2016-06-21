package com.sirma.weather;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadingDAO {
    private final List<Reading> readings = new ArrayList<>();

    public void addReading(Reading read){
        readings.add(read);
    }

    public List<Reading> getReadings() {
        return readings;
    }

}
