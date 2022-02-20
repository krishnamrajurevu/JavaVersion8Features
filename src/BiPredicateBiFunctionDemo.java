import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> checkSum = (a, b) -> a+b > 5;
        BiFunction<Integer, Integer, Integer> mutiplication = (a, b) -> a*b;
        System.out.println("BiPredicate " +checkSum.test(5,1));
        System.out.println("BiFunction " +mutiplication.apply(5,2));
    }
}
