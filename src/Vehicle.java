
public class Vehicle {
    private int id;
    private String type;
    private double weight;
    private String licensePlate;
    private String ownerName;
    private String ownerAddress;

    public Vehicle(int id, String type, double weight, String licensePlate, String ownerName, String ownerAddress) {
        this.id = id;
        this.type = type;
        this.weight = weight;
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
    }
    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }
}
