public class automobile extends vehicle implements vehicleInterface {

    enum autos{
        machinery,
        buses,
        cars,
    }

    private int capacity;

    public automobile(String manufacturer, int i) {
        super(manufacturer);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void numOfWheels() {
        System.out.println("This automobile has 4 wheels.");
    }

    @Override
    public void fuelType() {
        System.out.println("This automobile consumes unleaded premium.");
    }

    @Override
    public void automobilePurpose() {
        System.out.println("This autombile consumes is used in farming.");
    }

    @Override
    public void numOfPropellers() {

    }

    @Override
    public void howDeep() {

    }

    @Override
    public void numOfEngines() {

    }

    @Override
    public void aeroplaneType() {

    }
}
