
public class Main {

    public static void main(String[] args) {
        // write your test code here
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();
        
        System.out.println("--");
        //Class A superclass of B, B superclass of C
        c.a();
        c.b();
        c.c();
    }
}
