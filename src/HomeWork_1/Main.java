package HomeWork_1;

public class Main {
    public static void main(String[] args) {
        Thread thread10 = new NewThread("10");
        thread10.start();
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new NewThread(String.valueOf(i + 1));
        }
        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }
    }
}
