public class boat extends vehicle implements vehicleInterface {

    private int capacity;

    public boat(String manufacturer, int i) {
        super(manufacturer);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void numOfPropellers() {
        System.out.println("This boat has 2 propellers.");
    }

    @Override
    public void howDeep() {
        System.out.println("This boat goes on a river");
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
    public void numOfEngines() {

    }

    @Override
    public void aeroplaneType() {

    }
}
