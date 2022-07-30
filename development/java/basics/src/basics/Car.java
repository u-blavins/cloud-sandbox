package basics;

/**
 * Class named Car
 *
 * Fields:
 * - variables that belongs to a class or an object
 * - piece of data
 *
 * Constructors:
 * - Typically initialise the objects internal
 * fields - if necessary
 *
 * Methods:
 * - Typically used when you need to group operations together,
 * that you need to be able to execute from several places.
 */
public class Car {
    // define field brand which all Car objects have
    private final String brand;

    public Car(String carBrand) {
        this.brand = carBrand;
    }

    public String getBrand() {
        return this.brand;
    }
}
