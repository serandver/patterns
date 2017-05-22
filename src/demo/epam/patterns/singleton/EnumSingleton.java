package demo.epam.patterns.singleton;

/** Enum Singleton
 * + Сериализация из коробки
 * + Потокобезопасность из коробки
 * + Возможность использования EnumSet, EnumMap и т.д.
 * + Поддержка switch
 * - Не ленивая инициализация
 */

public enum EnumSingleton {
    INSTANCE;
}
