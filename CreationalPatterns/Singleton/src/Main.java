public class Main {
    public static void main(String[] args) {
        System.out.println("SINGLETON DESIGN PATTERN DEMO.!");
        BasicSingleton singleton = BasicSingleton.getInstance("single Threaded Singleton");
        System.out.println(singleton + " " + singleton.getProperty());

        ThreadSafeSingleton tSingleton = ThreadSafeSingleton.getInstance("thread safe singleton");
        System.out.println(singleton + " " + tSingleton.getProperty());

    }
}