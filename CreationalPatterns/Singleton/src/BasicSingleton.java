public class BasicSingleton {

    private static BasicSingleton instance;
    private String property;
    private  BasicSingleton(String property) {
        this.property = property;
    }

    public static BasicSingleton getInstance(String data) {
        if (instance == null) {
            instance = new BasicSingleton(data);
        }

        return instance;
    }

    public String getProperty() {
        return property;
    }
}
