public class Candidate1 {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        while(x<5){
            //Candidate code
            y=x-y;
            //Candidate code
            System.out.print(x+""+y+" ");
            x=x+1;
        }
    }
}

//Output : 00 11 21 32 42