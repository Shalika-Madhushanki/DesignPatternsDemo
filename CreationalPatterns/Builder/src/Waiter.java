public class Waiter {
    private PastaBuilder pastaBuilder;

    public void setPastaBuilder(PastaBuilder builder) {
        pastaBuilder = builder;
    }

    public Pasta getPasta() {
        return pastaBuilder.getPasta();
    }

    public void makePasta() {
        pastaBuilder.createPastaDish();
        pastaBuilder.buildDough("wheat");
        pastaBuilder.buildBoil();
        pastaBuilder.buildMeats("chicken");
        pastaBuilder.buildCheese("parmesan");
        pastaBuilder.heatPasta();
        pastaBuilder.buildToppings("parsley");
    }
}
