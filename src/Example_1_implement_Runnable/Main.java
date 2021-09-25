package Example_1_implement_Runnable;

public class Main {
    public static void main(String[] args) {
        // Создание потоков на основе класса, реализующего интерфейс Runnable
        Thread thr2 = new Thread(new NewThread(), "2 thr");
        Thread thr3 = new Thread(new NewThread(), "3 thr");
        Thread thr4 = new Thread(new NewThread(), "4 thr");
        // Старт всех потоков
        thr2.start();
        thr3.start();
        thr4.start();
        // Последний оператор главного метода. Однако, не смотря на то, что главный метод закончится, параллельные потоки будут продолжать свою работу
        System.out.println("Stop program");
    }
}
