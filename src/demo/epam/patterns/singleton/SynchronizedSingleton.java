package demo.epam.patterns.singleton;

/** Synchronized Accessor
 * + Ленивая инициализация
 * - Низкая производительность (критическая секция) в наиболее типичном доступе
 */

public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
