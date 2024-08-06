//Page 353
//Look at this code.
//Read it carefully, then
//answer the questions
//below. (Note: there
//are no syntax errors in
//this code.)

import java.util.*;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }
    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        Set<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}
class Book {
    private String title;
    public Book(String t) {
        title = t;
    }
}


//Questions

//1. What is the result when you compile this code?
//Ans. It compiles correctly

//2.If it compiles, what is the result when you run the TestTree class?
//Ans. It throws exception :
//Exception in thread "main" java.lang.ClassCastException: class Book cannot be cast to class java.lang.Comparable (Book is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//at java.base/java.util.TreeMap.put(TreeMap.java:785)
//at java.base/java.util.TreeMap.put(TreeMap.java:534)
//at java.base/java.util.TreeSet.add(TreeSet.java:255)
//at TestTree.go(TestTree.java:12)
//at TestTree.main(TestTree.java:5)

//3.If there is a problem (either compile-time or runtime) with this code, how would you fix it?
//Ans. By either implementing comparable in Book class or creating a comparator

//Implementing comparable
//class Book implements Comparable<Book> {
//    public int compareTo(Book b2) {
//        return this.title.compareTo(b2.title);
//    }
//    public String toString() {
//        return title;
//    }
//}

//Providing a Comparator
//class BookComparator implements Comparator<Book> {
//    public int compare(Book b1, Book b2) {
//        return b1.getTitle().compareTo(b2.getTitle());
//    }
//}