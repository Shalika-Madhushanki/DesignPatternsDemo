public class Main {
    public static void main(String[] args) {

        System.out.println("FACTORY METHOD DESIGN PATTERN DEMO.!");

        Restaurant cheesyPizzaRestaurant= new CheesyPizzaRestaurant();
        Pizza cheesypizza = cheesyPizzaRestaurant.orderPizza();
        System.out.println(cheesypizza.toString());

        Restaurant deviledChickenRestaurant = new DeviledPizzaRestaurant();
        Pizza deviledPizza = deviledChickenRestaurant.orderPizza();
        System.out.println(deviledPizza.toString());



    }
}