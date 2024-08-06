//Page 293

//Result : Not compile because of null exception.
public class TestBox {
    private Integer i;            //default i=null
    private int j;                //default j=0
    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }
    public void go() {
        j = i;                    //j=i=null
        System.out.println(j);
        System.out.println(i);
    }
}
