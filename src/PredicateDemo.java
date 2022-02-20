import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() >= 5;
        System.out.println("predicate value "+ predicate.test("krishnam"));

        Predicate<String> checkEventLength = s -> s.length()%2 == 0;
        System.out.println("check lenth  "+checkEventLength.test("krishnam"));
        System.out.println("Joining and  "+predicate.and(checkEventLength).test("krishnam"));
        System.out.println("Joining or  "+predicate.or(checkEventLength).test("krishnam"));
        System.out.println("Joining negate  "+predicate.negate().test("krishnam"));
    }
}
