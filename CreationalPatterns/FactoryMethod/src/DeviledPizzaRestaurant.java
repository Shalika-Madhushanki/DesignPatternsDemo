public class DeviledPizzaRestaurant extends Restaurant {

    @Override
    public Pizza createPizza() {
        return new DeviledChickenPizza();
    }
}
