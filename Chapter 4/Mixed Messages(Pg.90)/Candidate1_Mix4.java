//Output : 14 1

public class Candidate1_Mix4 {
    int counter = 0;
    public static void main(String[] args) {
        int count = 0;
        Candidate1_Mix4[] mixes = new Candidate1_Mix4[20];
        int i = 0;
        while (i<9) {
            mixes[i] = new Candidate1_Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
            i = i + 1;
        }
        System.out.println(count + " " +
                mixes[1].counter);
    }
    public int maybeNew(int index) {
        if (index<5) {
            Candidate1_Mix4 mix = new Candidate1_Mix4();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }
}
