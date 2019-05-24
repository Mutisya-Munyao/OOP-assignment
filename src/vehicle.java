public abstract class vehicle {

    public static automobile vehicleType;
    protected String manufacturer;
    public static Object vehiclePrice;

    public vehicle(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void printVehicleDetails(){
        System.out.println("Vehicle Type: "+manufacturer);
    }
}
