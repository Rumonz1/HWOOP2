package transport;

import java.time.LocalDate;

public class Автомобиль {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    //
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsNumber;
    private boolean summerWheels;


    public Автомобиль(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand  == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";} else {
            this.brand =brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";}else {
            this.model = model;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";}else {
            this.country = country;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;}else { this.engineVolume = engineVolume;
        }
        if (color == null || color.isBlank() || color.isEmpty()) {
            this. color = "белый";}else {this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        }else {
            this.year = year;
        }
        this.transmission = "АКП";
        this.registrationNumber = "х000хх000";
        this.bodyType = "Седан";
        this.summerWheels = true;
        this.seatsNumber = 4;

    }

    public void changeWheels() {
        summerWheels = !summerWheels;

    }

    public boolean isCorrectRegNum() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char chars[] = registrationNumber.toCharArray();
        if (Character.isAlphabetic(chars[0]) || Character.isAlphabetic(chars[4]) || Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "АКП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isSummerWheels() {
        return summerWheels;
    }

    public void setSummerWheels(boolean summerWheels) {
        this.summerWheels = summerWheels;
    }
}
