package products;

import products.Laptop;

public class SamsungLaptop implements Laptop {
    private String ramSize;
    private int hardCapacity;
    @Override
    public void code() {
        System.out.println("coding with windows os...");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling Samsung laptop with RAM size" + ramSize + " & Hard capacity " + hardCapacity);
    }
}
