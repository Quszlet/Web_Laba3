package ru.pnzgu.mopevm3;

public class Car extends Vehicle {

    private String car_body;
    private String power_steering;

    public Car(String brand, int price, int year, int mileage, String reg_number, String body, String power_steering){
        this.brand = brand;
        this.price = price;
        this.year_of_release =year;
        this.mileage = mileage;
        this.reg_number = reg_number;
        this.car_body = body;
        this.power_steering = power_steering;
    }

    public String getCar_body(){
        return this.car_body;
    }

    public String getPower_steering(){
        return this.power_steering;
    }

    public void setCar_body(String value) {
        this.car_body = value;
    }

    public void setPower_steering(String value) {
        this.power_steering = value;
    }

    @Override
    public String information() {
        return "\n Car = {brand = " + this.brand + "; price = " + price + "; year_of_release = " + this.year_of_release
                + "; mileage = " + this.mileage + "; reg_number = " + this.reg_number + "; car_body = " + this.car_body
                + "; power_steering = " + this.power_steering + "}";
    }
}
