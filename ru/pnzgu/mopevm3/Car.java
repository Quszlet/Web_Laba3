package ru.pnzgu.mopevm3;

public class Car extends Vehicle {

    private String car_body; // Тип кузова
    private String power_steering; // Тип рулевого усилителя

    // Конструкто по умолчанию
    public Car(){
        super();
        this.car_body = null;
        this.power_steering = null;
    }

    // Конструктор с параметрами
    public Car(String brand, int price, int year, int mileage, String reg_number, String body, String power_steering){
        super(brand, price, year, mileage, reg_number);
        this.car_body = body;
        this.power_steering = power_steering;
    } // Конструктор с параметрами

    // Функция возвращает значение поля типа кузова
    public String getCar_body(){
        return this.car_body;
    }

    // Функция возвращает значение поля рулевой усилитель
    public String getPower_steering(){
        return this.power_steering;
    }

    // Функция устанавливает новоя значение поля тип кузоа
    public void setCar_body(String value) {
        this.car_body = value;
    }

    // Функция устанавливает новоя значение поля рулевой усилитель
    public void setPower_steering(String value) {
        this.power_steering = value;
    } //

    // Переопределенная функция, которая возвращает в строковом виде всю информацию об объекте
    @Override
    public String information() {
        return "\n Car = {brand = " + this.brand + "; price = " + price + "; year_of_release = " + this.year_of_release
                + "; mileage = " + this.mileage + "; reg_number = " + this.reg_number + "; car_body = " + this.car_body
                + "; power_steering = " + this.power_steering + "}";
    }
}
