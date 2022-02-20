public class InterfaceWithStaticImpl implements InterfaceWithStaticDemo {
    public static void main(String[] args) {
        InterfaceWithStaticImpl obj = new InterfaceWithStaticImpl();
        obj.defaultMethod();
        //obj.staticMethod();

        InterfaceWithStaticDemo.staticMethod();
    }
}
