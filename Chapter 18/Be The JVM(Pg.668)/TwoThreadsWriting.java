import java.util.*;
import java.util.concurrent.*;
public class TwoThreadsWriting {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Data data = new Data();
        threadPool.execute(() -> addLetterToData('a', data));
        threadPool.execute(() -> addLetterToData('A', data));
        threadPool.shutdown();
    }
    private static void addLetterToData(char letter, Data data) {
        for (int i = 0; i < 26; i++) {
            data.addLetter(letter++);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {}
        }
        System.out.println(Thread.currentThread().getName() + data.getLetters());
        System.out.println(Thread.currentThread().getName()
                + " size = " + data.getLetters().size());
    }
}
final class Data {
    private final List<String> letters = new ArrayList<>();
    public List<String> getLetters() {return letters;}
    public void addLetter(char letter) {              // update : make the method synchronized
        letters.add(String.valueOf(letter));
    }
}

//Result : Output is not same everytime due to concurrency issues.
//Sample Output :
//pool-1-thread-1[a, A, b, C, d, e, F, f, G, H, i, J, k, K, L, M, n, N, O, P, Q, q, R, S, s, T, U, u, V, W, w, X, x, y, Y, z, Z]
//pool-1-thread-2[a, A, b, C, d, e, F, f, G, H, i, J, k, K, L, M, n, N, O, P, Q, q, R, S, s, T, U, u, V, W, w, X, x, y, Y, z, Z]
//pool-1-thread-2 size = 37
//pool-1-thread-1 size = 37

//To resolve the concurrency issue

//Solution 1 :
//public synchronized void addLetter(char letter) {
//    letters.add(String.valueOf(letter));
//}

//Solution 2 :
//private final List<String> letters = new CopyOnWriteArrayList<>();

//After updation the output will be :
//pool-1-thread-2[a, A, B, b, c, C, D, d, E, e, F, f, G, g, H, h, I, i, J, j, K, k, L, l, M, m, N, n, O, o, P, p, Q, q, R, r, S, s, T, t, U, u, V, v, W, w, X, x, Y, y, Z, z]
//pool-1-thread-2 size = 52
//pool-1-thread-1[a, A, B, b, c, C, D, d, E, e, F, f, G, g, H, h, I, i, J, j, K, k, L, l, M, m, N, n, O, o, P, p, Q, q, R, r, S, s, T, t, U, u, V, v, W, w, X, x, Y, y, Z, z]
//pool-1-thread-1 size = 52
