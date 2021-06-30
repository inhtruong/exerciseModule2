package ImplementObjectPool;

public class TaxiNotFoundException extends Throwable {
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
