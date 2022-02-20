public class Interface2 implements InterfaceDemo{
    public void printName(){
        System.out.println("overridden default method or dummy method");
    }
    public static void main(String[] args) {
        Interface2 obj = new Interface2();
        obj.printName();
    }
}
