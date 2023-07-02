package factories;

import factories.Factory;
import products.Laptop;
import products.MobilePhone;
import products.SamsungLaptop;
import products.SamsungMobilePhone;

public class SamsungManufacture extends Factory {
    @Override
    public MobilePhone createMobilePhone() {
        return new SamsungMobilePhone();
    }

    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}
