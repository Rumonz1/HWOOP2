package transport;

import java.time.LocalDate;

public class Автомобиль {
    private  String brand;
    private  String model;
    public double engineVolume;
    public String color;
    private  int year;
    private  String country;
    //
    public String transmission;
    private  String bodyType;
    public String registrationNumber;
    private  int seatsNumber;
    public String wheelsSummerOrWinter;


    public Автомобиль(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
        if (brand  == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (color == null || color.isBlank() || color.isEmpty()) {
            this. color = "белый";
        }
        if (year <= 0) {
            this.year = 2000;
        }

    }
    public Автомобиль(String brand, String model, int year, String country, String color, double engineVolume, String transmission, String bodyType, int seatsNumber, String registrationNumber, String wheelsSummerOrWinter) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.seatsNumber = seatsNumber;
        this.registrationNumber = registrationNumber;
        this.wheelsSummerOrWinter = wheelsSummerOrWinter;
        if (brand == null|| brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        }
        if (model == null|| model.isBlank() || model.isEmpty()) {
            this.model = "default";
        }
        if (country == null|| country.isEmpty() || country.isBlank()) {
            this.country = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (color == null|| color.isBlank() || color.isEmpty()) {
            this.color = "белый";
        }
        if (year <= 0) {
            this.year = 2000;
        }
        if (transmission == null|| transmission.isBlank() || transmission.isEmpty()){
            this.transmission = "default";
        }
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "default";
        }
        if (bodyType == null || bodyType.isBlank() || bodyType.isEmpty()) {
            this.bodyType = "default";
        }
        boolean summerOrWinter = LocalDate.now().getMonthValue() > 2 && LocalDate.now().getMonthValue() < 12;
        if (summerOrWinter = true){
            this.wheelsSummerOrWinter = "Летняя резина";
        } else {
            this.wheelsSummerOrWinter = "Зимняя резина";
        }
  //      if (LocalDate.now().getMonthValue() > 2 && LocalDate.now().getMonthValue() < 12) {
  //          this.wheelsSummerOrWinter = "Летняя резина";
   //     } else if (LocalDate.now().getMonthValue() == 12 || LocalDate.now().getMonthValue() == 1 || LocalDate.now().getMonthValue() == 2) {
   //         this.wheelsSummerOrWinter = "Зимняя резина";
  //      }
        if (seatsNumber == 0) {
            this.seatsNumber = 4;
        }
    }

    public void changeWheels() {
        if (LocalDate.now().getMonthValue() > 2 && LocalDate.now().getMonthValue() < 12 && wheelsSummerOrWinter == "Зимняя резина") {
            System.out.println("Срочно поменяй резины на Летнюю!");
        } else if (LocalDate.now().getMonthValue() <= 2 && LocalDate.now().getMonthValue() == 12 && wheelsSummerOrWinter == "Летняя резина") {
            System.out.println("Срочно поменяй резину на Зимнюю!");
        } else {
            System.out.println("Менять резину пока не нужно!");
        }

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
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getWheelsSummerOrWinter() {
        return wheelsSummerOrWinter;
    }

    public void setWheelsSummerOrWinter(String wheelsSummerOrWinter) {
        this.wheelsSummerOrWinter = wheelsSummerOrWinter;
    }

    public String toString(){
         return "Автомобиль - "+brand+" "+model+"."+" Год выпуска - "+year+"."+" Страна где собрано - "+country+"."+" Цвет  "+color+"."+" Объём двигателя - "+engineVolume+" литров. Кол-во мест: "+seatsNumber+". Тип кузова: "+bodyType+". Резина: "+wheelsSummerOrWinter+". Регистрационный номер: "+registrationNumber+". Коробка передач: "+transmission+".";
    }
}
