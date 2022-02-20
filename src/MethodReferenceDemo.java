public class MethodReferenceDemo {
    public static void main(String[] args) {
        //No reusability
        FunctionalInterfaceDemo f = () -> System.out.println("Single abstract method");
        f.running();

        // reusable
        FunctionalInterfaceDemo functionalInterfaceDemo = Test :: methodReference;
        functionalInterfaceDemo.running();
    }
}

class Test {
    public static void methodReference(){
        System.out.println("Method reference");
    }
}
