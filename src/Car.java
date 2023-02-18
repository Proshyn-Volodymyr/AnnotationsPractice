import java.util.Objects;

public class Car extends Vehicle {
    private char segment;
    private String fuelSource;
    private double weight;
    private boolean isAutopilot;

    public Car() {
        super();
        this.segment = 'S';
        this.fuelSource = "diesel";
        this.weight = 3.0;
        this.isAutopilot = false;
    }

    public Car(char segment, String fuelSource, double weight, boolean isAutopilot) {
        this.segment = segment;
        this.fuelSource = fuelSource;
        this.weight = weight;
        this.isAutopilot = isAutopilot;
    }
@MethodInfo
    public char getSegment() {
        return segment;
    }

    public void setSegment(@ParameterInfo char segment) {
        this.segment = segment;
    }

    public String getFuelSource() {
        return fuelSource;
    }
@MethodInfo
    public void setFuelSource(String fuelSource) {
        this.fuelSource = fuelSource;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAutopilot() {
        return isAutopilot;
    }

    public void setAutopilot(@ParameterInfo boolean autopilot) {
        isAutopilot = autopilot;
    }

    @Override
    public boolean equals(@ParameterInfo Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return segment == car.segment && Objects.equals(fuelSource, car.fuelSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segment, fuelSource);
    }

    @Override
    public String toString() {
        return "Car{" +
                "segment=" + segment +
                ", fuelSource='" + fuelSource + '\'' +
                ", weight=" + weight +
                ", isAutopilot=" + isAutopilot +
                '}';
    }
}
