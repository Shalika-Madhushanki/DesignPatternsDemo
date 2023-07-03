public class AmericanPastaBuilder  extends PastaBuilder {
    @Override
    public void buildDough(String flour) {
        this.pasta.setDough(flour);
    }

    @Override
    public void buildBoil() {
        System.out.println("pasta is boiling in normal water");
    }

    @Override
    public void buildMeats(String meats) {
        pasta.setMeats(meats);
    }

    @Override
    public void buildCheese(String cheese) {
        pasta.setCheese(cheese);
    }

    @Override
    public void heatPasta() {
        System.out.println("pasta is heating in pan");
    }

    @Override
    public void buildToppings(String toppings) {
        pasta.setToppings(toppings);
    }
}
