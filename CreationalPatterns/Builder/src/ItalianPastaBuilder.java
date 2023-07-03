public class ItalianPastaBuilder extends PastaBuilder {
    @Override
    public void buildDough(String flour) {
        this.pasta.setDough(flour);
    }

    @Override
    public void buildBoil() {
        System.out.println("Pasta is boiling in vegetable broth");
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
        pasta.setCheese("pasta is heating in oven");
    }

    @Override
    public void buildToppings(String toppings) {
        pasta.setToppings(toppings);
    }
}
