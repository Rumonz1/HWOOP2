import transport.Автомобиль;

public class Main {
    private static void printInfo(Автомобиль auto){
        System.out.println("Автомобиль - " + auto.getBrand() + " " + auto.getModel() + "." + " Год выпуска - " + auto.getYear() + "." + " Страна где собрано - " + auto.getCountry() + "." + " Цвет  " + auto.getColor() + "." + " Объём двигателя - " + auto.getEngineVolume() + " литров. Кол-во мест: " + auto.getSeatsNumber() + ". Тип кузова: " + auto.getBodyType() + ". " + (auto.isSummerWheels()?"Летняя":"Зимняя")+" резина . Регистрационный номер: " + auto.getRegistrationNumber() + ". Коробка передач: " + auto.getTransmission() + ".");
    }
    public static void main(String[] args) {
        //Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
        //Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
        //BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        //Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
        //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
        Автомобиль auto1 = new Автомобиль("Lada", "2",2015,"Россия","жёлтый",1.7);
        auto1.setRegistrationNumber("А992КК777");
        auto1.setTransmission("МКП");
        Автомобиль auto2 = new Автомобиль("Audi","A8 50 L TDI quattro",2020,"Германия","черный",3.0);
        auto2.setSummerWheels(false);
        Автомобиль auto3 = new Автомобиль("2","Z8",2021,"Германия","черный",3.0);

        Автомобиль auto4 = new Автомобиль("Kia","Sportage 4-го поколения",2018,"Южная Корея","красный",2.4);

        Автомобиль auto5 = new Автомобиль("Hyundai","Avante",0,"Южная Корея","оранжевый",1.6);
        System.out.println();
        printInfo(auto1);
        printInfo(auto2);
        printInfo(auto3);
        printInfo(auto4);
        printInfo(auto5);
        ////
        ////
    }
}
