public class Pasta {
    private String wheat;
    private String meats;
    private String toppings;
    private String cheese;

    public void setDough(String wheat) {
        this.wheat = wheat;
    }

    public void setBoil() {
        System.out.println("Pasta is boiling");
    }

    public void setMeats(String meats) {
        this.meats = meats;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    public void heatPasta() {
        System.out.println("Pasta is heating");
    }
    @Override
    public String toString() {
        return "A Pasta dish with flour- " + wheat + ", meat- " + meats + ", cheese- " + cheese + ", Toppings- " +toppings + " is ready..!" ;
    }
}
