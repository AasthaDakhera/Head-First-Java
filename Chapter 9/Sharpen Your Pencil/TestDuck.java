//Page 250
//Match the new Duck() call with the constructor
//that runs when that Duck is instantiated

class Duck {
    private int kilos = 6;
    private float floatability = 2.1F;
    private String name = "Generic";
    private long[] feathers = {1, 2, 3,
            4, 5, 6, 7};
    private boolean canFly = true;
    private int maxSpeed = 25;

    //Constructor type 1
    public Duck() {
        System.out.println("type 1 duck");
    }

    //Constructor type 2
    public Duck(boolean fly) {
        canFly = fly;
        System.out.println("type 2 duck");
    }

    //Constructor type 3
    public Duck(String n, long[] f) {
        name = n;
        feathers = f;
        System.out.println("type 3 duck");
    }

    //Constructor type 4
    public Duck(int w, float f) {
        kilos = w;
        floatability = f;
        System.out.println("type 4 duck");
    }

    //Constructor type 5
    public Duck(float density, int max) {
        floatability = density;
        maxSpeed = max;
        System.out.println("type 5 duck");
    }
}

public class TestDuck {
    public static void main(String[] args) {
        int weight = 8;
        float density = 2.3F;
        String name = "Donald";
        long[] feathers = {1, 2, 3, 4, 5, 6};
        boolean canFly = true;
        int airspeed = 22;
        Duck[] d = new Duck[7];
        d[0] = new Duck();                          //Constructor type 1
        d[1] = new Duck(density, weight);           //Constructor type 5
        d[2] = new Duck(name, feathers);            //Constructor type 3
        d[3] = new Duck(canFly);                    //Constructor type 2
        d[4] = new Duck(3.3F, airspeed);    //Constructor type 5
        d[5] = new Duck(false);                //Constructor type 2
        d[6] = new Duck(airspeed, density);        //Constructor type 4
    }
}
