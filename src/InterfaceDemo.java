public interface InterfaceDemo {
    //void printName();

//    default int hashCode(){
//
//    }

    default void printName(){
        System.out.println("default implementation or dummy implementation");
    }
}
