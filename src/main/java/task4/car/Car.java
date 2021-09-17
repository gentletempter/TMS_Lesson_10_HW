package task4.car;

import java.util.Objects;

/**
 * The class represents the car
 */
public abstract class Car {
    private String brand;
    private String model;
    private String fuel;
    private String color;
    private int releaseDate;

    public Car(String brand, String model, String fuel, String color, int releaseDate) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.color = color;
        this.releaseDate = releaseDate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuel() {
        return fuel;
    }

    public String getColor() {
        return color;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return releaseDate == car.releaseDate && brand.equals(car.brand) && model.equals(car.model) && fuel.equals(car.fuel) && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, fuel, color, releaseDate);
    }

    @Override
    public String toString() {
        return "Car{" + brand + ' ' + model + ", " + fuel + ", " + releaseDate + ", " + color + '}';
    }
}
