import ru.pnzgu.mopevm3.*;

public class Main {
    public static void main(String[] args) {
        InterfaceUser.print_intro();

        Car Lada_Granta = new Car("Lada Granta", 1200000, 2018, 0, "А681TB",
                "Седан", "Пневматический");
        Car Toyota_Camry = new Car("Toyota Camry", 1100000, 2015, 60000, "К381ММ",
                "Седан", "Электрический");
        Trucks Scania_450 = new Trucks("Scania 450", 14500000, 2016, 288631,
                "C942LK", "4x2", "S");
        Trucks Scania_234 = new Trucks("Scania 234", 6949000, 2011, 824604,
                "B648XY", "4x2", "R");
        Car car = new Car();
        Trucks trucks = new Trucks();

        Vehicle.AddArray(Lada_Granta);
        Vehicle.AddArray(Toyota_Camry);
        Vehicle.AddArray(Scania_450);
        Vehicle.AddArray(Scania_234);
        Vehicle.AddArray(car);
        Vehicle.AddArray(trucks);

        InterfaceUser.input_user();
    }

}