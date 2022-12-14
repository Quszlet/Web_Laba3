package ru.pnzgu.mopevm3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InterfaceUser {
    /*
     * Эта функция выводит в консоль номер лабораторной работы, номер бригады,
     * студентов состоящих в бригаде, задание, предметную область.
     */
    public static void print_intro(){
        System.out.println("ЛР3. ООП");
        System.out.println("Бригада №3. Изгарев.В & Копылов.Е\n");
        System.out.println("Необходимо реализовать в рамках объектноориентированной парадигмы на языке Java " +
                "предложенные варианты заданий.\n" +
                "Реализовать иерархию минимум из 3 классов. Каждый класс должен" +
                "иметь в своем составе минимум 5 полей и 3 метода.\n" +
                "Выполнить анализ предметной области. Спроектировать и реализовать" +
                "структуру классов предметной области. Разработать программу,\n" +
                "демонстрирующую использование возможностей полученной иерархии классов.\n" +
                "\nТранспортные средства.\n" +
                "– определить самый дешевый автомобиль;\n" +
                "– определить самый пробег для машин старше 3 лет;\n" +
                "– упорядочить массив по убыванию года выпуска;\n" +
                "– организовать поиск по регистрационному номеру, исправление одного\n" +
                "из полей и вывод полной информации об транспортном средстве после\n" +
                "редактирования\n");
    }

    /*
     *  Эта функция выводит в консоль все возможные функции, которые
     *  программа может реализовать.
     */
    public static void input_user(){
        Scanner in = new Scanner(System.in);
        String value = "";
        System.out.println("Выбирете цифру одной из представленных функций\n" +
                "1: Узнать об существующих объектах\n" +
                "2: Определить самый дешевый автомобиль\n" +
                "3: Определить самый большой пробег для машин старше 3 лет\n" +
                "4: Упорядочить массив по убыванию года выпуска\n" +
                "5: Поиск и изменение одного поля\n" +
                "6: Создать новый объект\n" +
                "Для выхода из программы введите 'exit'\n");
        while(!value.equals("exit")){
            value = in.next();
            choose_function(value);
        }
    }

    /*
     *  Функция принимает номер, введенным пользователем, и в соотвествием с номером
     *  реализовывает соответствующию функцию
     */
    private static void choose_function(String number) {
        switch (number) {
            case "1":
                Vehicle.informationAll();
                break;
            case "2":
                System.out.println(Vehicle.most_lowed_cost());
                break;
            case "3":
                System.out.println(Vehicle.most_high_mileage());
                break;
            case "4":
                System.out.println(Vehicle.sort_year_of_release());
                break;
            case "5":
                System.out.println(Vehicle.find_and_edit());
                break;
            case "6":
                Scanner in = new Scanner(System.in);
                System.out.println("Выберите цифру объект\n" +
                        "1: Passenger_car\n" + "2: Trucks\n");
                String input = in.next();
                switch (input) {
                    case "1":
                        System.out.println("Введите значение для поля 'brand':");
                        String brand = check_input_string(in.next());
                        System.out.println("Введите значение для поля 'price':");
                        int price = check_input_int(in.next());
                        System.out.println("Введите значение для поля 'year_of_release':");
                        int year = check_input_int(in.next());
                        System.out.println("Введите значение для поля 'mileage':");
                        int mileage = check_input_int(in.next());
                        System.out.println("Введите значение для поля 'reg_number':");
                        String reg_number = check_input_string(in.next());
                        System.out.println("Введите значение для поля 'car_body':");
                        String car_body = check_input_string(in.next());
                        System.out.println("Введите значение для поля 'power_steering':");
                        String power_steering = check_input_string(in.next());
                        Passenger_car New_onj = new Passenger_car(brand, price, year, mileage, reg_number,
                                car_body, power_steering);
                        Vehicle.AddArray(New_onj);
                        System.out.println("Вы создали новый объект Car!");
                        Vehicle.informationAll();
                        break;
                    case "2":
                        System.out.println("Введите значение для поля 'brand':");
                        brand = check_input_string(in.next());
                        System.out.println("Введите значение для поля 'price':");
                        price = check_input_int(in.next());
                        System.out.println("Введите значение для поля 'year_of_release':");
                        year = check_input_int(in.next());
                        System.out.println("Введите значение для поля 'mileage':");
                        mileage = check_input_int(in.next());
                        System.out.println("Введите значение для поля 'reg_number':");
                        reg_number = check_input_string(in.next());
                        System.out.println("Введите значение для поля 'number_of_axes':");
                        String number_of_axes = check_input_string(in.next());
                        System.out.println("Введите значение для поля 'class_type':");
                        String class_type = check_input_string(in.next());
                        Trucks New_obj = new Trucks(brand, price, year, mileage, reg_number, number_of_axes, class_type);
                        Vehicle.AddArray(New_obj);
                        System.out.println("Вы создали новый объект Trucks!");
                        Vehicle.informationAll();
                        break;
                    default:
                        System.out.println("Ошибка. Такого объекта с таким номером нет!");
                        break;
                }
                break;
            case "exit":
                System.out.println("Вы вышли из программы!");
                break;
            default:
                System.out.println("Ошибка. Такой функции нет!");
                break;
        }
    }

    /*
     *  Функция проверяет вводимое значение пользователем и заставляет вводить
     *  пользователя строковое значения, пока он его не введет.
     */
    public static String check_input_string(String value){
        Scanner in = new Scanner(System.in);
        String regex = "^[a-zA-Zа-яА-Я]*$";
        while (!Pattern.matches(regex, value)){
            System.out.println("Для этого поля не может быть присвоено числовое значение. Введите строку");
            value = in.next();
        }
        return value;
    }

    /*
     *  Функция проверяет вводимое значение пользователем и заставляет вводить
     *  пользователя числовое значение, пока он его не введет.
     */
    public static int check_input_int(String value){
        Scanner in = new Scanner(System.in);
        String regex = "^\\d*$";
        while (!Pattern.matches(regex, value)){
            System.out.println("Для этого поля не может быть присвоено cтроковое значени. Введите число");
            value = in.next();
        }
        return Integer.parseInt(value);
    }
}
