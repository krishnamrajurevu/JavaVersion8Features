public interface InterfaceWithStaticDemo {
    static  void staticMethod(){
        System.out.println("static method implementation");
    }

    default void defaultMethod(){
        System.out.println("default method implementation");
    }
}

