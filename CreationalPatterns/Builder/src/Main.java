public class Main {
    public static void main(String[] args) {

        System.out.println("BUILDER DESIGN PATTERN DEMO.!");
        Waiter waiter = new Waiter();
        AmericanPastaBuilder americanPastaBuilder = new AmericanPastaBuilder();
        ItalianPastaBuilder italianPastaBuilder = new ItalianPastaBuilder();
        waiter.setPastaBuilder(americanPastaBuilder);
        waiter.makePasta();
        Pasta pastaDish = waiter.getPasta();
        System.out.println(pastaDish.toString());
    }
}