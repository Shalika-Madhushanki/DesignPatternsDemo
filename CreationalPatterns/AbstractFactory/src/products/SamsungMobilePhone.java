package products;

import products.MobilePhone;

public class SamsungMobilePhone implements MobilePhone {
    @Override
    public void call() {
        System.out.println("calling with samsung mobile...");

    }

    @Override
    public void assemble() {
        System.out.println("Assembling Sumsung mobile");
    }
}
