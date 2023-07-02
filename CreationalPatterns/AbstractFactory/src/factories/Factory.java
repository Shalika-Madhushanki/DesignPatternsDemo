package factories;

import products.Laptop;
import products.MobilePhone;

public abstract class Factory {
    public abstract MobilePhone createMobilePhone();
    public abstract Laptop createLaptop();
}
