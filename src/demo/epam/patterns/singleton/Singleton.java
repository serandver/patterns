package demo.epam.patterns.singleton;

/** Lazy, not synchronized Singleton
 * Только для однопоточных программ!
 */
public class Singleton {
    private static Singleton instance;
    private Singleton () {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
