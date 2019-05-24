public class main {

    private static Object vehicleType;

    public static void main(String[] args) {

        automobile machinery = new automobile("Machinery", 6000);
        machinery.printVehicleDetails();
        machinery.numOfWheels();
        machinery.fuelType();
        machinery.automobilePurpose();

        System.out.println("--------------------------------");

        automobile buses = new automobile("Buses", 2000);
        buses.printVehicleDetails();
        buses.numOfWheels();
        buses.fuelType();
        buses.automobilePurpose();

        System.out.println("--------------------------------");

        aeroplane aeroplane = new aeroplane("Aeroplane", 20000);
        aeroplane.printVehicleDetails();
        aeroplane.numOfEngines();
        aeroplane.aeroplaneType();

        System.out.println("--------------------------------");

        boat dhows = new boat("Dhows", 100);
        dhows.printVehicleDetails();
        dhows.numOfPropellers();
        dhows.howDeep();

        System.out.println("--------------------------------");

        boat ferries = new boat("Ferries", 12000);
        ferries.printVehicleDetails();
        ferries.numOfPropellers();
        ferries.howDeep();

        System.out.println("--------------------------------");

        boat ships = new boat("Ships", 22000);
        ships.printVehicleDetails();
        ships.numOfPropellers();
        ships.howDeep();

        System.out.println("--------------------------------");

        automobile cars = new automobile("Cars", 1000);
        cars.printVehicleDetails();
        cars.numOfWheels();
        cars.fuelType();
        cars.automobilePurpose();

        System.out.println("--------------------------------");

    }
}
