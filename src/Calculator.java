import java.util.function.*;

public class Calculator {
    private final int MAX_INT = 2147483647;

    //< ,Calculator>
    static Supplier<Calculator> instance = Calculator::new;
    //static Supplier<Calculator> instance = () -> new Calculator();

    //<Integer, Integer>
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //BinaryOperator<Integer> devide = (x, y) -> x / y;                         //Первоначально
    //BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : MAX_INT;      //Вариант 1
    BinaryOperator<Integer> devide = (x, y) -> {                                //Вариант 2
        if (y != 0) {
            return x / y;
        } else {
            return MAX_INT;
        }
    };

    //<Integer, Integer>
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    //<Integer, boolean>
    Predicate<Integer> isPositive = x -> x > 0;

    //<Integer, void>
    //Consumer<Integer> println = System.out::println;                          //Первоначально
    Consumer<Object> println = System.out::println;                             //Попробуем так
}
