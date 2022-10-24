package ru.pnzgu.mopevm3;

public class Car extends Vehicle {

    private String car_body; // Тип кузова
    private String power_steering; // Тип рулевого усилителя

    public Car(){
        this.brand = null;
        this.price = -1;
        this.year_of_release = -1;
        this.mileage = -1;
        this.reg_number = null;
        this.car_body = null;
        this.power_steering = null;
    }

    public Car(String brand, int price, int year, int mileage, String reg_number, String body, String power_steering){
        this.brand = brand;
        this.price = price;
        this.year_of_release =year;
        this.mileage = mileage;
        this.reg_number = reg_number;
        this.car_body = body;
        this.power_steering = power_steering;
    } // Конструктор с параметрами

    public String getCar_body(){
        return this.car_body;
    } // Возвращает значение типа кузова

    public String getPower_steering(){
        return this.power_steering;
    } // Возвращает тип усилителя руля

    public void setCar_body(String value) {
        this.car_body = value;
    } // Устанавливает новое значение для типа кузова

    public void setPower_steering(String value) {
        this.power_steering = value;
    } //

    @Override
    public String information() {
        return "\n Car = {brand = " + this.brand + "; price = " + price + "; year_of_release = " + this.year_of_release
                + "; mileage = " + this.mileage + "; reg_number = " + this.reg_number + "; car_body = " + this.car_body
                + "; power_steering = " + this.power_steering + "}";
    }
}
