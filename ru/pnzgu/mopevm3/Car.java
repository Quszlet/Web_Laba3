package ru.pnzgu.mopevm3;

import java.util.regex.Pattern;

public class Car extends Vehicle {

    private String car_body;
    private String tires;

    public Car(String brand, int price, int year, int mileage, String reg_number, String body, String tires){
        this.brand = brand;
        this.price = price;
        this.year_of_release =year;
        this.mileage = mileage;
        this.reg_number = reg_number;
        this.car_body = body;
        this.tires = tires;
    }

    @Override
    public void fi(String number){

    };

    public String getCar_body(){
        return this.car_body;
    }

    public String getTires(){
        return this.tires;
    }

    @Override
    public String information() {
        return "\n Vehicle={brand=" + this.brand + "; price=" + price + "; year of release=" + this.year_of_release
                + "; mileage=" + this.mileage + "; reg number=" + this.reg_number + "; car body=" + this.car_body
                + "; tires=" + this.tires + "}";
    }

}
