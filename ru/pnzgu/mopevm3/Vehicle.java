package ru.pnzgu.mopevm3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Vehicle {

    protected String brand;
    protected int mileage;
    protected String reg_number;
    protected int price;
    protected int year_of_release;
    static private ArrayList<Vehicle> Vehicle_arr = new ArrayList<>();

    public  abstract String information();

    public static void AddArray(Vehicle object){
        Vehicle_arr.add(object);
    }

    public static void RemoveArray(Vehicle object){
        Vehicle_arr.remove(object);
    }

    public int getPrice(){
        return this.price;
    }

    public int getMileage(){
        return this.mileage;
    }

    public int getYear_of_release(){
        return this.year_of_release;
    }

    public String getReg_number(){
        return this.reg_number;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public void setReg_number(String reg_number){
        this.reg_number = reg_number;
    }

    public void  setYear_of_release(int year){
        this.year_of_release = year;
    }

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

    public static ArrayList<Integer> sort_year_of_release(){
        ArrayList<Integer> year_arr = new ArrayList<>();
        for(int i = 0; i < Vehicle_arr.size(); i++){
            year_arr.add(Vehicle_arr.get(i).getYear_of_release());
        }
        Collections.sort(year_arr);
        Collections.reverse(year_arr);
        return year_arr;
    }

    public static String find_and_edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой объект вы хотите изменить? Для выбора введите регистрационный номер");
        String number = scanner.next();
        System.out.println("Какое поле вы хотите изменить?");
        String field = scanner.next();
        System.out.println("Введите новое значение");
        String value = scanner.next();
        scanner.close();

        for (Vehicle obj : Vehicle_arr) {

            if (number.equals(obj.getReg_number())) {

                String regex2 = "^\\d*$";
                if (Pattern.matches(regex2, value)) {

                    int intValue = Integer.parseInt(value);
                    switch (field) {
                        case "price":
                            obj.setPrice(intValue);
                            return obj.information();
                        case "year_of_release":
                            obj.setYear_of_release(intValue);
                            return obj.information();
                        case "mileage":
                            obj.setMileage(intValue);
                            return obj.information();
                        case "brand":
                        case "reg_number":
                            return ("Ошибка. Этому полю не может быть присвоенно числовое значение");
                        default:
                            return ("Ошибка. Такого поля нет");
                    }
                } else {
                    switch (field) {
                        case "brand":
                            obj.setBrand(value);
                            return obj.information();
                        case "reg_number":
                            obj.setReg_number(value);
                            return obj.information();
                        case "price":
                        case "year_of_release":
                        case "mileage":
                            return ("Ошибка. Этому полю не может быть присвоенно строкове значение");
                        default:
                            return ("Ошибка. Такого поля нет");
                    }
                }
            }
        }
        return ("Такого регистрационного номера нет!");
    }

    public static void informationAll() {
        System.out.print("Объекты:");
        for (Vehicle obj: Vehicle_arr) {
            System.out.println(obj.information());
        }
    }
}
