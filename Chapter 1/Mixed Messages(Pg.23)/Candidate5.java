public class Candidate5 {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        while(x<5){
            //Candidate code
            if(y<5){
                x=x+1;
                if(y<3) {
                    x = x - 1;
                }
            }
            y=y+2;
            //Candidate code
            System.out.print(x+""+y+" ");
            x=x+1;
        }
    }
}

//Output : 02 14 36 48