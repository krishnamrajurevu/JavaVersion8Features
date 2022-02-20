import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.stream().filter(a -> a>=20).forEach(System.out::println);
        list.stream().map(i -> i*i).forEach(System.out::println);
       // list.stream().peek(i -> i*i).forEach(System.out::println);
    }
}
