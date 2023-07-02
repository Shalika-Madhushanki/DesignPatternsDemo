import factories.AppleManufacturer;
import factories.Factory;
import factories.SamsungManufacture;
import products.Laptop;
import products.MobilePhone;

public class Main {
    public static void main(String[] args) {

        System.out.println("ABSTRACT FACTORY DESIGN PATTERN DEMO.!");
        Factory appleManufacture = new AppleManufacturer();
        Laptop appleLaptop = appleManufacture.createLaptop();
        appleLaptop.assemble();
        appleLaptop.code();

        Factory samsungManufacturer = new SamsungManufacture();
        MobilePhone samsungPhone = samsungManufacturer.createMobilePhone();
        samsungPhone.assemble();
        samsungPhone.call();
    }
}