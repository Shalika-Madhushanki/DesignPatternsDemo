public class DeviledChickenPizza implements Pizza{

    private String chicken;
    @Override
    public void prepare() {
        System.out.println("Prepare pizza with deviled chicken");
    }

    @Override
    public String toString() {
        return "Here is a Deviled chicken pizza";
    }

}
