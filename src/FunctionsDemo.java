import java.util.function.Function;

public class FunctionsDemo {
    public static void main(String[] args) {
        Function<Integer, Integer>  doubleInt = i -> i+i;
        Function<Integer, Integer>  cubeInt = i -> i*i*i;
        System.out.println("double the value "+doubleInt.apply(3));
        System.out.println("cube the value "+cubeInt.apply(3));
        System.out.println("functional chaining andthen "+doubleInt.andThen(cubeInt).apply(3));
        System.out.println("functional chaining compose"+doubleInt.compose(cubeInt).apply(3));
    }
}
