/**
 * Created by adavi on 13.08.2017.
 */

/**------------------ Створюємо новий потік який реалізує інтерфейс----------------- **/
public class MyRunnable implements Runnable {

    /**------------------ Інтерфейс Runnable  має всього один метод --- run()--------------**/
    @Override
    public void run() {
        go();
    }

    private void go() {
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
