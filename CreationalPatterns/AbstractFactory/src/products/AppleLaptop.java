package products;

public class AppleLaptop implements Laptop {
    private String ramSize;
    private int hardCapacity;

    @Override
    public void code() {
        System.out.println("Coding with mac os...");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling mac book with RAM size" + ramSize + " & Hard capacity " + hardCapacity);
    }
}
