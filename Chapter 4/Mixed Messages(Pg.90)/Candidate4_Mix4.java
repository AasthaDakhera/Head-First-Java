//Output : 20 1

public class Candidate4_Mix4 {
    int counter = 0;
    public static void main(String[] args) {
        int count = 0;
        Candidate4_Mix4[] mixes = new Candidate4_Mix4[20];
        int i = 0;
        while (i<19) {
            mixes[i] = new Candidate4_Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
            i = i + 1;
        }
        System.out.println(count + " " + mixes[1].counter);
    }
    public int maybeNew(int index) {
        if (index<1) {
            Candidate4_Mix4 mix = new Candidate4_Mix4();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }
}
