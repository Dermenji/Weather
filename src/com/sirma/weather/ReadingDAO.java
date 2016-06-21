package com.sirma.weather;

import java.util.ArrayList;
import java.util.List;

public class ReadingDAO {
    private final List<Reading> readings = new ArrayList<>();

    public void addReading(Reading read){
        readings.add(read);
    }
}
