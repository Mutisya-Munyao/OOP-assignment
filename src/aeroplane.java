public class aeroplane extends vehicle implements vehicleInterface {

    private int capacity;

    public aeroplane(String manufacturer, int i) {
        super(manufacturer);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void printVehicleDetails(){
        System.out.println("Vehicle Type: "+manufacturer);
    }

    @Override
    public void numOfWheels() {

    }

    @Override
    public void fuelType() {

    }

    @Override
    public void automobilePurpose() {

    }

    @Override
    public void numOfPropellers() {

    }

    @Override
    public void howDeep() {

    }

    @Override
    public void numOfEngines() {
        System.out.println("This plane has 4 engines.");

    }

    @Override
    public void aeroplaneType() {
        System.out.println("This is a cargo plane");

    }
}
