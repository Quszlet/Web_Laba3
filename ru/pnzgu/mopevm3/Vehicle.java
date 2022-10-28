package ru.pnzgu.mopevm3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public abstract class Vehicle {

    protected String brand; // Название машины
    protected int mileage; // Пробег
    protected String reg_number; // Регистрационный номер
    protected int price; // Цена
    protected int year_of_release; // Год выпуска
    static private ArrayList<Vehicle> Vehicle_arr = new ArrayList<>(); // Массив, хранящий созданные объекты

    // Конструктор по умолчанию
    public Vehicle(){
        this.brand = null;
        this.price = -1;
        this.year_of_release = -1;
        this.mileage = -1;
        this.reg_number = null;
    }

    // Конструктор с параметрами
    public Vehicle(String brand, int price, int year, int mileage, String reg_number){
        this.brand = brand;
        this.price = price;
        this.year_of_release =year;
        this.mileage = mileage;
        this.reg_number = reg_number;
    }

    // Функция возврашает в строковом виде информацию об объекте
    public  abstract String information();

    // Функция добавляет объект в массив Vehicle_arr
    public static void AddArray(Vehicle object){
        Vehicle_arr.add(object);
    }

    // Функция удаляет объект из массива Vehicle_arr
    public static void RemoveArray(Vehicle object){ // удаление объекта в массив Vehicle_arr
        Vehicle_arr.remove(object);
    }

    // Функция возвращает цену
    public int getPrice(){
        return this.price;
    }

    // Функция возвращает пробег
    public int getMileage(){
        return this.mileage;
    }

    // Функция возвращает год выпуска
    public int getYear_of_release(){
        return this.year_of_release;
    }

    // Функция возвращает год выпуска
    public String getReg_number(){
        return this.reg_number;
    }

    // Функция возвращает марку
    public String getBrand(){
        return this.brand;
    }

    // Функция устанавливает новое значение для марки
    public void setBrand(String brand){
        this.brand = brand;
    }

    // Функция устанавливает новое значение для цены
    public void setPrice(int price){
        this.price = price;
    }

    // Фукнция устанавливает новое значение для пробега
    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    // Функция устанавливает новое значение для регистрационного номер
    public void setReg_number(String reg_number){
        this.reg_number = reg_number;
    }

    // Функция устанавливает новое значение для года выпуска
    public void  setYear_of_release(int year){
        this.year_of_release = year;
    }

    // Функция возвращает марку самого дешевого транспорта
    public static String most_lowed_cost(){
        int min_elem = Vehicle_arr.get(0).getPrice();
        String name = Vehicle_arr.get(0).getBrand();
        for(Vehicle elem: Vehicle_arr){
            if (elem.getPrice() < min_elem){
                min_elem = elem.getPrice();
                name = elem.getBrand();
            }
        }
        return name;
    }

    // Функция возвращает самый большой пробег для машин старше 3-х лет
    public static int most_high_mileage(){
        int max_elem = Vehicle_arr.get(0).getMileage();
        for(Vehicle obj: Vehicle_arr){
            int age = 2022 - obj.getYear_of_release();
            int elem = obj.getMileage();
            if (max_elem < elem && age > 3){
                max_elem = elem;
            }
        }
        return max_elem;
    }

    // Функция возвращает сортированный массив в порядке убывания
    public static ArrayList<Integer> sort_year_of_release(){
        ArrayList<Integer> year_arr = new ArrayList<>();
        for(int i = 0; i < Vehicle_arr.size(); i++){
            year_arr.add(Vehicle_arr.get(i).getYear_of_release());
        }
        Collections.sort(year_arr);
        Collections.reverse(year_arr);
        return year_arr;
    }

    /*
     * Находит объект по регистрационному номеру, изменяет выбранное поле
     * и возращает всю информацию об этом объекте
     */
    public static String find_and_edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой объект вы хотите изменить? Для выбора введите регистрационный номер");
        String number = scanner.next();
        System.out.println("Какое поле вы хотите изменить?");
        String field = scanner.next();

        for (Vehicle obj : Vehicle_arr) {

            if (number.equals(obj.getReg_number())) {
                System.out.println("Введите новое значение");
                switch (field) {
                    case "price":
                        int intValue = InterfaceUser.check_input_int(scanner.next());
                        obj.setPrice(intValue);
                        return obj.information();
                    case "year_of_release":
                        intValue = InterfaceUser.check_input_int(scanner.next());
                        obj.setYear_of_release(intValue);
                        return obj.information();
                    case "mileage":
                        intValue = InterfaceUser.check_input_int(scanner.next());
                        obj.setMileage(intValue);
                        return obj.information();
                    case "brand":
                        String value = InterfaceUser.check_input_string(scanner.next());
                        obj.setBrand(value);
                        return obj.information();
                    case "reg_number":
                        value = InterfaceUser.check_input_string(scanner.next());
                        obj.setReg_number(value);
                        return obj.information();
                    case "class_type":
                        value = InterfaceUser.check_input_string(scanner.next());
                        return obj.setType(obj, value);
                    case "number_of_axes":
                        value = InterfaceUser.check_input_string(scanner.next());
                        return obj.setNumb_of_axes(obj, value);
                    case "power_steering":
                        value = InterfaceUser.check_input_string(scanner.next());
                        return obj.setPower_steering(obj, value);
                    case "car_body":
                        value = InterfaceUser.check_input_string(scanner.next());
                        return obj.setCar_body(obj, value);
                    default:
                        return ("Ошибка. Такого поля нет");
                }
            }
        }
        return ("Такого регистрационного номера нет!");
    }

    // Функция выводит в консоль все существующие объекты и информацию о их полях
    public static void informationAll() {
        System.out.print("Объекты:");
        for (Vehicle obj: Vehicle_arr) {
            System.out.println(obj.information());
        }
    }

    // Функция устанавливает новое значение у класса наследника Trucks
    private String setType(Vehicle obj, String value) {
        if(obj instanceof Trucks) {
            ((Trucks) obj).setClass_type(value);
            return obj.information();
        }
        else return ("Ошибка. Такого поля нет");
    }

    // Функция устанавливает новое значение поля number_of_axes у класса наследника Trucks
    private String setNumb_of_axes(Vehicle obj, String value) {
        if(obj instanceof Trucks) {
            ((Trucks) obj).setNumber_of_axes(value);
            return obj.information();
        }
        else return ("Ошибка. Такого поля нет");
    }

    // Функция устанавливает новое значение поля car_body у класса наследника Car
    private String setCar_body(Vehicle obj, String value) {
        if(obj instanceof Passenger_car) {
            ((Passenger_car) obj).setCar_body(value);
            return obj.information();
        }
        else return ("Ошибка. Такого поля нет");
    }

    // Функция устанавливает новое значение поля power_steering у класса наследника Car
    private String setPower_steering(Vehicle obj, String value) {
        if(obj instanceof Passenger_car) {
            ((Passenger_car) obj).setPower_steering(value);
            return obj.information();
        }
        else return ("Ошибка. Такого поля нет");
    }

}
