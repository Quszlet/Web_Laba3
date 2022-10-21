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

    public String getTrailer(){
        return this.class_type;
    }
    @Override
    public String information() {
        return "\n Trucks = { brand = " + this.brand + "; price = " + price + "; year_of_release = "
                + this.year_of_release + "; mileage = " + this.mileage + "; reg_number = " + this.reg_number
                + "; number_of_axes = " + this.number_of_axes + "; class_type = " + this.class_type + "}";
    }
}
