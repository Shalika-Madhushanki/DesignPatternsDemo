public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private String property;
    private ThreadSafeSingleton(String property) {
        this.property = property;
    }

    public static ThreadSafeSingleton getInstance(String data) {
            if (instance == null) {
                synchronized (BasicSingleton.class) {
                    if (instance == null) {
                        instance = new ThreadSafeSingleton(data);
                    }
                }

            }
        return instance;
    }

    public String getProperty() {
        return property;
    }
}
