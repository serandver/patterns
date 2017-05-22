package demo.epam.patterns.singleton;

/** On Demand Holder idiom
 * + Ленивая инициализация
 * + Высокая производительность
 * - Невозможно использовать для не статических полей класса
 */
public class OnDemandHolderSingleton {

    private OnDemandHolderSingleton() {
    }

    public static class SingletonHolder {
        public static final OnDemandHolderSingleton HOLDER_INSTANCE = new OnDemandHolderSingleton();
    }

    public static OnDemandHolderSingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
