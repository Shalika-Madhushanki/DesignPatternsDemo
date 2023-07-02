public class CheesyPizza implements Pizza {

    private String cheese;
    @Override
    public void prepare() {
        System.out.println("Prepare pizza with mozzarella cheese");
    }

    @Override
    public String toString() {
        return "Here is a Cheesy pizza..!";
    }
}
