package demo.epam.patterns.singleton;

/** Double Checked Locking & volatile
 * + Ленивая инициализация
 * + Высокая производительность
 * - Поддерживается только с JDK 1.5
 */

public class DoubleCheckedSingleton {

    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        DoubleCheckedSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return localInstance;
    }
}
