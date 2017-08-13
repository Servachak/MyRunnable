/**
 * Created by adavi on 13.08.2017.
 */
public class Main {

    public static void main(String[] args) {
/**------------------ Створюємо об'єкт Runnable (Задачу для потока)**/
        Runnable threadJob = new MyRunnable();

        /**---------------- Створюємо обєкт Thread (Виконавця) и передаємо йому Runnable  -- new Thread(threadJob)**/
        Thread thread = new Thread(threadJob);

/**----------------- Запускаємо потік ---------------------**/
        thread.start();
        System.out.println("Повернення в M");
        System.out.println("Повернення в Ma");
        System.out.println("Повернення в Mai");
        System.out.println("Повернення в Main");


    }
}
