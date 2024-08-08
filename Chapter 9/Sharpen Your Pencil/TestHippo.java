//Page 254
//What’s the real output? Given the
//code on the left, what prints out
//when you run TestHippo? A or B?

class Animal {
    public Animal() {
        System.out.println("Making an Animal");
    }
}

class Hippo extends Animal {
    public Hippo() {
        System.out.println("Making a Hippo");
    }
}

public class TestHippo {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Hippo h = new Hippo();
    }
}

//Ans. A
//Output :
//Starting...
//Making an Animal
//Making a Hippo