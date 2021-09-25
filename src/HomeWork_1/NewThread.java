package HomeWork_1;

import java.math.BigInteger;

public class NewThread extends Thread {
    NewThread(String name) {
        super(name);
    }

    // Переопределяем метод run()
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        int threadNumber = Integer.valueOf(Thread.currentThread().getName());
        System.out.println(threadName + ": factorial of " + threadName + " is: " + factorial(threadNumber));
    }

    BigInteger factorial (int number) {
        if (number == 0 || number == 1) {
            return BigInteger.valueOf(1);
        }
        return factorial(number - 1).multiply(BigInteger.valueOf(number));
    }
}
