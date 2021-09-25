package Example_2_extend_Thread;

import Example_1_implement_Runnable.NewThread;

// Создаём новые потоки на основе переопределения класса Thread
public class Main {
    public static void main(String[] args) {
        // Создание потоков на основе класса, реализующего интерфейс Runnable
        Thread thr2 = new Thread(new NewThread(), "2 thr");
        Thread thr3 = new Thread(new NewThread(), "3 thr");
        Thread thr4 = new Thread(new NewThread(), "4 thr");
        // Создаём объекты переопределённого класса
        NewThread2 thr5 = new NewThread2("5 thr");
        NewThread2 thr6 = new NewThread2("6 thr");
        NewThread2 thr7 = new NewThread2("7 thr");
        // Запуск созданных потоков
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        thr6.start();
        thr7.start();
        // Последний оператор главного метода. Однако, не смотря на то, что главный метод закончится, параллельные потоки будут продолжать свою работу
        System.out.println("Stop program");
    }
}
