package HomeWork_2;

public class NewThread implements Runnable {

    @Override
    public void run() {
        // В паралелльном потоке будет выводиться имя этого потока и числа от 0 до 100
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
