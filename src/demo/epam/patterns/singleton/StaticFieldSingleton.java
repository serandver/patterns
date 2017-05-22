package demo.epam.patterns.singleton;

/** Static field Singleton
 * + Простая и прозрачная реализация
 * + Потокобезопасность
 * - Не ленивая инициализация
 */

public class StaticFieldSingleton {
    public static final StaticFieldSingleton INSTANCE = new StaticFieldSingleton();
}
