public class CheesyPizzaRestaurant extends Restaurant {
    @Override
    public Pizza createPizza() {
        return new CheesyPizza();
    }
}
