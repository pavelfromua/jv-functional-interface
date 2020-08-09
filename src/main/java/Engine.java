import java.util.Objects;

public class Engine {

    private EngineType engineType;
    private Integer engineVolume;

    public Engine(EngineType engineType, Integer engineVolume) {
        this.engineType = engineType;
        this.engineVolume = engineVolume;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Integer getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Integer engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Engine engine = (Engine) o;
        return engineType == engine.engineType
                && Objects.equals(engineVolume, engine.engineVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, engineVolume);
    }

    @Override
    public String toString() {
        return "Engine{" + "engineType=" + engineType + ", engineVolume=" + engineVolume + '}';
    }
}
