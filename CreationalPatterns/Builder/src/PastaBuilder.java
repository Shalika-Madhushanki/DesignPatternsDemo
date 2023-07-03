public abstract class PastaBuilder {
    Pasta pasta;

    public Pasta getPasta() {
        return pasta;
    }

    public void createPastaDish() {
        pasta = new Pasta();
    }

    public abstract void buildDough(String flour);
    public abstract void buildBoil();

    public abstract void buildMeats(String meats);

    public abstract void buildCheese(String cheese);

    public abstract void heatPasta();
    public abstract void buildToppings(String toppings);

}
