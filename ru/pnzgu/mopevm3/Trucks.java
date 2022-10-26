package ru.pnzgu.mopevm3;

public class Trucks  extends Vehicle {
    private String number_of_axes; // Количество осей
    private String class_type; // Класс грузовика

    // Конструктор по умолчанию
    public Trucks(){
        super();
        this.number_of_axes = null;
        this.class_type = null;
    }

    // Конструктор с параметрами
    public Trucks(String brand, int price, int year, int mileage, String reg_number, String axes, String class_type){
        super(brand, price, year, mileage, reg_number);
        this.number_of_axes = axes;
        this.class_type = class_type;
    }

    // Функция возвращает значение поля количетсво осей
    public String getNumber_of_axes(){
        return this.number_of_axes;
    }

    // Функция возвращает значение по класс грузовик
    public String getClass_type(){
        return this.class_type;
    }

    // Функция устанавливает новое значение полю количество осей
    public void setNumber_of_axes(String value) { // Устанавливет новое значение для поля количеств осей
        this.number_of_axes = value;
    }

    // Функция устанавливает новое значение полю класс грузовика
    public void setClass_type(String value) { // Устанавливет новое значение для поля класс грузовика
        this.class_type = value;
    }

    // Переопределенная функция, которая возвращает в строковом виде всю информацию об объекте
    @Override
    public String information() { // переопределенный метод, который выводит полную информацию об объекте
        return "\n Trucks = { brand = " + this.brand + "; price = " + price + "; year_of_release = "
                + this.year_of_release + "; mileage = " + this.mileage + "; reg_number = " + this.reg_number
                + "; number_of_axes = " + this.number_of_axes + "; class_type = " + this.class_type + "}";
    }

}
