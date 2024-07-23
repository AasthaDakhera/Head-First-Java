/*Result : The file will give arrayIndexOutOfBound error since the array
index starts with 0 and ends with n-1;
 */

//Updated file
class Hobbits {
    String name;
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = -1;                        //change the value of z
        while (z < 2) {                    //change the loop condition
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}
