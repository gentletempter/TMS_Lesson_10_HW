package task4.car;

/**
 * Groupe PSA concern cars
 */
public class GroupePSA extends Car {
    public GroupePSA(String brand, String model, String fuel, String color, int releaseDate) {
        super(brand, model, fuel, color, releaseDate);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
