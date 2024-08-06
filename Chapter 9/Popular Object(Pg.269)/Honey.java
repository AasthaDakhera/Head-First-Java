//Result : The most popular object is honey object reference by honeyPot variable since it has the most references.

class Bees {
    Honey[] beeHoney;
}
class Raccoon {
    Kit rk;
    Honey rh;
}
class Kit {
    Honey honey;
}
class Bear {
    Honey hunny;
}

public class Honey {
    public static void main(String[] args) {
        Honey honeyPot = new Honey();
        Honey[] ha = {honeyPot, honeyPot, honeyPot, honeyPot};  //array of size 4 references honeyPot
        Bees bees = new Bees();
        bees.beeHoney = ha;
        Bear[] bears = new Bear[5];
        for (int i = 0; i < 5; i++) {
            bears[i] = new Bear();
            bears[i].hunny = honeyPot;  //each bear object's hunny references to honeyPot
        }
        Kit kit = new Kit();
        kit.honey = honeyPot;  //kit object's oney references to honeyPot
        Raccoon raccoon = new Raccoon();
        raccoon.rh = honeyPot; //raccoon.rh references to honeypot
        raccoon.rk = kit;
        kit = null;
    } // end of main
}
