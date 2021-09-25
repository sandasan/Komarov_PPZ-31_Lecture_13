package HomeWork_2;

public class Main {
    public static void main(String[] args) {
        Thread thr1 = new Thread(new NewThread(), "1 thr");
        Thread thr2 = new Thread(new NewThread(), "2 thr");
        Thread thr3 = new Thread(new NewThread(), "3 thr");
        Thread thr4 = new Thread(new NewThread(), "4 thr");
        Thread thr5 = new Thread(new NewThread(), "5 thr");
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        System.out.println("Stop program");
    }
}
