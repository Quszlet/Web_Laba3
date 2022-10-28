import ru.pnzgu.mopevm3.*;

public class Main {
    public static void main(String[] args) {
        InterfaceUser.print_intro();

        Passenger_car Lada_Granta = new Passenger_car("Lada Granta", 1200000, 2018,
                0, "А681TB", "Седан", "Пневматический");
        Passenger_car Toyota_Camry = new Passenger_car("Toyota Camry", 1100000, 2015,
                60000, "К381ММ", "Седан", "Электрический");
        Trucks Scania_450 = new Trucks("Scania 450", 14500000, 2016, 288631,
                "C942LK", "4x2", "S");
        Trucks Scania_234 = new Trucks("Scania 234", 6949000, 2011, 824604,
                "B648XY", "4x2", "R");


        Vehicle.AddArray(Lada_Granta);
        Vehicle.AddArray(Toyota_Camry);
        Vehicle.AddArray(Scania_450);
        Vehicle.AddArray(Scania_234);

        InterfaceUser.input_user();
    }

}