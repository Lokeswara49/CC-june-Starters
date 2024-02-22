public class B{
    public static void main(String[] args) {
        B b=new B();
//        b.run();
        A te = new A();
        te.a=10;
        System.out.println(te.a);
        A te1=new A();
       te1.a=20;
        System.out.println(te1.a);
        System.out.println(te.a);
//        System.out.println();
//        b.run1();
    }
    public void run() {
      A obj= new A();
        obj.a=10;
        System.out.println(obj.a);
    }
    public void run1() {
        A obj= new A();
        System.out.println(obj.a);
        obj.a=20;
        System.out.println(obj.a);
    }



}
