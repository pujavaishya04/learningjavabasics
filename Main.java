package Learning1;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    static int id = 0;

    static List<Vehicle> list = new ArrayList<>();

    public static void main(String[] args) {
        Main1 m = new Main1();

        m.addVehicle("suv", "BMW", "x3", 2024, true );
        m.addVehicle("sedan", "BMW", "x5", 2023, true);




        public void addVehicle(String "suv", String "BMW", String "x3", int 2024, boolean true) {
            id++;
            Vehicle car = new Vehicle(0, "suv", "BMW", "x3", 2024, true);

            list.add(car);
            public void getVehicle() {

                for (Vehicle car : list) {
                    System.out.println(car);
            }
        }
    }
}

    private void addVehicle(String type, String brand, String model, int year, boolean available) {
    }