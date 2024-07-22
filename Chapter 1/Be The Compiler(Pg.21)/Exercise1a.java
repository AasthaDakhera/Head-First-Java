/* Result : This java file will compile but it will run infinitely since,
   the loop condition will never be false.
*/

//Updated file
class Exercise1a {
    public static void main (String[] args){
        int x=1;
        while(x<10){
            x=x+1;              //added this line to prevent infinite loop
            if(x>3){
                System.out.println("big x");
            }
        }
    }
}
