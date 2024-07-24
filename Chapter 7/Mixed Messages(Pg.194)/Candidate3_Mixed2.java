//Output : A's m1, A's m2, C's m3, 13

public class Candidate3_Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        //Candidate Code
        a.m1();
        b.m2();
        c.m3();
        //Candidate Code
    }
}
