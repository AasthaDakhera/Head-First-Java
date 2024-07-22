public class Candidate3 {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        while(x<5){
            //Candidate code
            y=y+2;
            if(y>4){
                y=y-1;
            }
            //Candidate code
            System.out.print(x+""+y+" ");
            x=x+1;
        }
    }
}

//Output : 02 14 25 36 47
