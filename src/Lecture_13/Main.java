package Lecture_13;

public class Main {

    public static void main(String[] args) {
        Thread t = Thread.currentThread(); // Получение главного потока
        System.out.println(t.getName());
        try {
            t.sleep(3000); // Остановка потока на 3 секунды
        } catch (InterruptedException e) {
            System.out.println("main thread break");
        }
        System.out.println("Stop program");
    }
}

/*
* Алгоритм создания нового потока
* 1) Создаём класс, который наследует класс Thread.
* 2) Переопределяем метод run().
* 3) При необходимости переопределяем другие методы.
* 4) Создаём объект на основе класса.
* 5) Запускаем поток, используя метод start().
* */