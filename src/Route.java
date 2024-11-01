public class Route {
    private int id;
    private String name;
    private double length;
    private double weightRestriction;

    public Route(int id, String name, double length, double weightRestriction) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.weightRestriction = weightRestriction;
    }
    // Getters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWeightRestriction() {
        return weightRestriction;
    }
}
