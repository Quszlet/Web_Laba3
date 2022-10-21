package ru.pnzgu.mopevm3;

public class Trucks  extends Vehicle {
    private String number_of_axes;
    private String class_type;

    public Trucks(String brand, int price, int year, int mileage, String reg_number, String axes, String class_type){
        this.brand = brand;
        this.price = price;
        this.year_of_release =year;
        this.mileage = mileage;
        this.reg_number = reg_number;
        this.number_of_axes = axes;
        this.class_type = class_type;
    }

    public String getNumber_of_axes(){
        return this.number_of_axes;
    }

    public String getClass_type(){
        return this.class_type;
    }

    public void setNumber_of_axes(String value) {
        this.number_of_axes = value;
    }
    public void setClass_type(String value) {
        this.class_type = value;
    }
    @Override
    public String information() {
        return "\n Trucks = { brand = " + this.brand + "; price = " + price + "; year_of_release = "
                + this.year_of_release + "; mileage = " + this.mileage + "; reg_number = " + this.reg_number
                + "; number_of_axes = " + this.number_of_axes + "; class_type = " + this.class_type + "}";
    }

}
