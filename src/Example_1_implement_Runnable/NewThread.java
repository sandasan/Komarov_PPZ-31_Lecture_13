package Example_1_implement_Runnable;

public class NewThread implements Runnable {
    // Реализация интерфейса Runnable
    @Override
    public void run() {
        // В паралелльном потоке будет выводиться имя этого потока и числа от 0 до 160
        for (int i = 0; i < 160; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
