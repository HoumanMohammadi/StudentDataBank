package Animal;

public class PassportPrintingService<T> {

    private T thingToPrint;

    public PassportPrintingService(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void printPassport() {
        System.out.println("****");
        System.out.println("Passport of:");
        System.out.println(thingToPrint);
        System.out.println("****");
    }
}
