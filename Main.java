class A{
    void print(){
        System.out.println("At A");
    }
}
interface I{
    public abstract void printInterfaceI();

}
interface II{
    public abstract void printInterfaceII();
}

class B extends A implements I, II{
    public void printInterfaceI(){
        System.out.println("At I iterface");
    }

    public void printInterfaceII(){
        super.print();
        System.out.println("At II iterface");
    }

    public void printB(){
        super.print();
    }
}


public class Main {
    public static void main(String[] args){
        B b = new B();
        b.printInterfaceII();
    }
}
