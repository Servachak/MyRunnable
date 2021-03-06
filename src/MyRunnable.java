/**
 * Created by adavi on 13.08.2017.
 */

/**------------------ Створюємо новий потік який реалізує інтерфейс Runnable----------------- **/
public class MyRunnable implements Runnable {

    /**------------------ Інтерфейс Runnable  має всього один метод --- run()--------------**/
    @Override
    public void run() {
        go();
    }

    private void go() {
        /** -----------------------Призупиняємо роботу потоку на 2000 мілі секунд**/
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doMore();
    }

    private void doMore() {

        System.out.println("Вершина стека");
    }
}
