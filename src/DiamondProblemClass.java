
public class DiamondProblemClass implements DiamondProblemInterface1, DiamondProblemInterface2{

    public static void main(String[] args) {
        DiamondProblemClass obj = new DiamondProblemClass();
        obj.m1();
    }

    @Override
    public void m1() {
        DiamondProblemInterface2.super.m1();
    }

}
