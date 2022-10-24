package ru.pnzgu.mopevm3;

public class Trucks  extends Vehicle {
    private String number_of_axes; // Количество осей
    private String class_type; // Класс грузовика

    public Trucks(){
        this.brand = null;
        this.price = -1;
        this.year_of_release = -1;
        this.mileage = -1;
        this.reg_number = null;
        this.number_of_axes = null;
        this.class_type = null;
    }
    public Trucks(String brand, int price, int year, int mileage, String reg_number, String axes, String class_type){
        this.brand = brand;
        this.price = price;
        this.year_of_release =year;
        this.mileage = mileage;
        this.reg_number = reg_number;
        this.number_of_axes = axes;
        this.class_type = class_type;
    } // Конструктор с параметрами

    public String getNumber_of_axes(){
        return this.number_of_axes;
    } // Возвращает значение об количетсве осей

    public String getClass_type(){
        return this.class_type;
    } // Возвращает значение об классе грузовика

    public void setNumber_of_axes(String value) { // Устанавливет новое значение для поля количеств осей
        this.number_of_axes = value;
    }
    public void setClass_type(String value) { // Устанавливет новое значение для поля класс грузовика
        this.class_type = value;
    }
    @Override
    public String information() { // переопределенный метод, который выводит полную информацию об объекте
        return "\n Trucks = { brand = " + this.brand + "; price = " + price + "; year_of_release = "
                + this.year_of_release + "; mileage = " + this.mileage + "; reg_number = " + this.reg_number
                + "; number_of_axes = " + this.number_of_axes + "; class_type = " + this.class_type + "}";
    }

}
