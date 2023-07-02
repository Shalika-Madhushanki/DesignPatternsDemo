package factories;

import factories.Factory;
import products.AppleLaptop;
import products.AppleMobilePhone;
import products.Laptop;
import products.MobilePhone;

public class AppleManufacturer extends Factory {
    @Override
    public MobilePhone createMobilePhone() {
        return new AppleMobilePhone();
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}
