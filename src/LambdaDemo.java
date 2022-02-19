import java.util.function.BiConsumer;

public class LambdaDemo {
    public static void main(String[] args) {
        LambdaDemo obj = new LambdaDemo();
        obj.addition(5,10);

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(5,10);
    }

    public void addition(Integer a, Integer b) {
        System.out.println(a+b);
    }
}
