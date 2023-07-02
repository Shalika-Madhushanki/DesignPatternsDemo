package products;

public class AppleMobilePhone implements MobilePhone {

    @Override
    public void assemble() {
        System.out.println("Assembling iphone...");
    }
    @Override
    public void call() {
        System.out.println("calling with iphone...");
    }
}
