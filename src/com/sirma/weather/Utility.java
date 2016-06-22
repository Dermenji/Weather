package com.sirma.weather;


import com.opencsv.CSVReader;

import java.io.*;
import java.util.Properties;
import java.util.TimerTask;

public class Utility extends TimerTask {

    private ReadingDAO dao;

    private String getPath () {

        String path = null;
        try (FileReader reader = new FileReader("config.properties")) {
            Properties properties = new Properties();
            properties.load(reader);
            path = properties.getProperty("directory");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

    public void setMeasurements() {

        File[] files = new File(getPath()).listFiles();

        for (File f : files) {
            try {
                CSVReader reader = new CSVReader(new FileReader(f.getName()));
                String[] record;
                while ((record = reader.readNext()) != null) {
                    Reading read = new Reading();
                    read.setDateTime(record[0]);
                    read.setCity(record[1]);
                    read.setMeasurement(record[2]);
                    read.setReadingType(record[3]);
                    read.setValues(Integer.parseInt(record[4]));

                    dao.addReading(read);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error: can not load from file");
            }
        }
    }

    @Override
    public void run() {
        setMeasurements();
    }
}
