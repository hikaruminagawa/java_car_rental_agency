// Vehicle interface
interface Vehicle {
    String getMake();
    String getModel();
    int getYearOfManufacture();
}

// CarVehicle interface
interface CarVehicle extends Vehicle {
    int getNumberOfDoors();
    String getFuelType();
}

// MotorVehicle interface
interface MotorVehicle extends Vehicle {
    int getNumberOfWheels();
    String getType();
}

// TruckVehicle interface
interface TruckVehicle extends Vehicle {
    double getCargoCapacity();
    String getTransmissionType();
}

// Car class
class Car implements CarVehicle {
    private String make;
    private String model;
    private int yearOfManufacture;
    private int numberOfDoors;
    private String fuelType;

    public Car(String make, String model, int yearOfManufacture, int numberOfDoors, String fuelType) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYearOfManufacture() { return yearOfManufacture; }
    public int getNumberOfDoors() { return numberOfDoors; }
    public String getFuelType() { return fuelType; }
}

// Motorcycle class
class Motorcycle implements MotorVehicle {
    private String make;
    private String model;
    private int yearOfManufacture;
    private int numberOfWheels;
    private String type;

    public Motorcycle(String make, String model, int yearOfManufacture, int numberOfWheels, String type) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.numberOfWheels = numberOfWheels;
        this.type = type;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYearOfManufacture() { return yearOfManufacture; }
    public int getNumberOfWheels() { return numberOfWheels; }
    public String getType() { return type; }
}

// Truck class
class Truck implements TruckVehicle {
    private String make;
    private String model;
    private int yearOfManufacture;
    private double cargoCapacity;
    private String transmissionType;

    public Truck(String make, String model, int yearOfManufacture, double cargoCapacity, String transmissionType) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.cargoCapacity = cargoCapacity;
        this.transmissionType = transmissionType;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYearOfManufacture() { return yearOfManufacture; }
    public double getCargoCapacity() { return cargoCapacity; }
    public String getTransmissionType() { return transmissionType; }
}

