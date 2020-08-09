import java.util.function.BinaryOperator;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements BinaryOperator <Integer> {
    @Override
    public Integer apply(Integer value1, Integer value2) {
        return value1 - value2;
    }
}
