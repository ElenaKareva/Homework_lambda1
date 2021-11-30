import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    // распишем devide отдельным блоком для обработки условия делитель !=0 :
//  BinaryOperator<Integer> devide = (x, y) -> {
//      int r;
//      if(y == 0) {
//         System.out.println("Внимание! Деление на 0! Делить на 0 нельзя!");
//         r = 0;
//     } else {
//     r =  x / y;
//     }
//     return r;
// };


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
