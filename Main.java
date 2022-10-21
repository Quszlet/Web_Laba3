import ru.pnzgu.mopevm3.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car Lada_Granta = new Car("Lada Granta", 1200000, 2018, 0, "H681TB",
                "Седан", "Летние");
        Car Toyota_Camry = new Car("Toyota Camry", 1000000, 2015, 60000, "К381ММ",
                "Седан", "Летние");
        Trucks Scania_450 = new Trucks("Scania 450", 14500000, 2016, 288631,
                "C942LK", "4x2", "S");
        Trucks Scania_234 = new Trucks("Scania 234", 6949000, 2011, 824604,
                "B648XY", "4x2", "R");

        Vehicle.AddArray(Lada_Granta);
        Vehicle.AddArray(Toyota_Camry);
        Vehicle.AddArray(Scania_450);
        Vehicle.AddArray(Scania_234);

        System.out.println(Vehicle.most_lowed_cost());
        System.out.println(Vehicle.most_high_mileage());
        System.out.println(Vehicle.sort_year_of_release());

        System.out.println(Vehicle.find_and_edit("К381ММ"));
    }
}