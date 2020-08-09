import java.util.Objects;

public class Car {
    private String model;
    private Engine engine;
    private String color;
    private AutoType autoType;
    private Integer weight;

    public Car(String model, Engine engine, AutoType autoType, Integer weight) {
        this.model = model;
        this.engine = engine;
        this.autoType = autoType;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AutoType getAutoType() {
        return autoType;
    }

    public void setAutoType(AutoType autoType) {
        this.autoType = autoType;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Car car = (Car) other;
        return Objects.equals(model, car.model)
                && Objects.equals(engine, car.engine)
                && Objects.equals(color, car.color)
                && autoType == car.autoType
                && Objects.equals(weight, car.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, engine, color, autoType, weight);
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", engine=" + engine
                + ", color='" + color + '\''
                + ", autoType=" + autoType
                + ", weight=" + weight
                + '}';
    }
}
