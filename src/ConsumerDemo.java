import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> doubleInt = n -> System.out.println("taking input and no returns "+n*2);
        Consumer<Integer> cubeInt = n -> System.out.println("taking input and no returns "+n*n*n);
        doubleInt.accept(5);
        doubleInt.andThen(cubeInt).accept(5);
    }
}
