import ru.pnzgu.mopevm3.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        print_intro();

        Car Lada_Granta = new Car("Lada Granta", 1200000, 2018, 0, "А681TB",
                "Седан", "Пневматический");
        Car Toyota_Camry = new Car("Toyota Camry", 1100000, 2015, 60000, "К381ММ",
                "Седан", "Электрический");
        Trucks Scania_450 = new Trucks("Scania 450", 14500000, 2016, 288631,
                "C942LK", "4x2", "S");
        Trucks Scania_234 = new Trucks("Scania 234", 6949000, 2011, 824604,
                "B648XY", "4x2", "R");

        Vehicle.AddArray(Lada_Granta);
        Vehicle.AddArray(Toyota_Camry);
        Vehicle.AddArray(Scania_450);
        Vehicle.AddArray(Scania_234);

        Vehicle.informationAll();
        System.out.println("Самый дешевый автомобиль: " + Vehicle.most_lowed_cost() + "\n");
        System.out.println("Самый большой пробег для машин старше 3 лет: " + Vehicle.most_high_mileage() + "\n");
        System.out.println("Осортированный массив по убыванию года выпуска: " + Vehicle.sort_year_of_release() + "\n");
        System.out.println(Vehicle.find_and_edit());
    }
    public static void print_intro(){
        System.out.println("ЛР3. ООП");
        System.out.println("Бригада №3. Изгарев.В & Копылов.Е\n");
        System.out.println("Необходимо реализовать в рамках объектноориентированной парадигмы на языке Java предложенные варианты заданий.\n" +
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
}