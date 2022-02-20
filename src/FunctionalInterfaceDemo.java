
@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void running(); // exactly one singe abstract method in functional interface

    default void println(){
        System.out.println("functional interface zero or any no of default methods");
    }

    static void println2(){
        System.out.println("functional interface having zero or any no of static methods");
    }
}
