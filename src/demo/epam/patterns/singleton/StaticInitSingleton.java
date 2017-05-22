package demo.epam.patterns.singleton;

public class StaticInitSingleton {

    private static StaticInitSingleton instance;

    static {
        instance = new StaticInitSingleton();
        // В этом блоке возможна обработка исключений
    }

    private StaticInitSingleton () {}

    public static StaticInitSingleton getInstance() {
        return instance;
    }
}
