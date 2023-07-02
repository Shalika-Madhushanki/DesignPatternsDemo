public abstract class Restaurant {
    public Pizza orderPizza() {
        Pizza pizza;
        pizza = createPizza();

        /** Doing this way Can get rid of the if-else codes like below */
//        if (req == "deviled-chicken") {
//            pizza = new DeviledChickenPizza();
//        } else if (req == "cheesy") {
//            pizza = new CheesyPizza();
//        } else {
//            pizza = new Pizza();
//        }
        pizza.prepare();
        return pizza;
    }
     /* Factory Method*/
    public abstract Pizza createPizza();
}
