//Output : B's m1, A's m2, C's m3, 13

public class Candidate4_Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        //Candidate Code
        a2.m1();
        a2.m2();
        a2.m3();
        //Candidate Code
    }
}
