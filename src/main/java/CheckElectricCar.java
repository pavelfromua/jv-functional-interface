import java.util.function.Predicate;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.getEngine().getEngineType() == EngineType.ELECTRIC;
    }
}
