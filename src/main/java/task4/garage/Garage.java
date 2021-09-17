package task4.garage;

import task4.car.*;

import java.util.HashMap;

/**
 * Simulates the work of a car garage
 */
public class Garage {
    static HashMap<Car, Integer> carsMap = new HashMap<>();

    public static void parking(Car car) {
        carsMap.put(car, carsMap.getOrDefault(car, 0) + 1);
        System.out.println(">>>>Drove into the garage: " + car);
    }

    public static void departure(Car car) {
        carsMap.replace(car, carsMap.get(car) - 1);
        System.out.println("<<<<Drove out of the garage: " + car);
    }

    public static int getCountOfCars(Car car) throws NullPointerException {
        int result;
        try {
            result = carsMap.get(car);
        } catch (NullPointerException ex) {
            result = 0;
        }
        return result;
    }

    public static void getGarageDemo() {
        Car car1 = new VAG("VW", "Passat", "diesel", "white", 2020);
        Car car2 = new GroupePSA("Opel", "Astra", "petrol", "black", 2015);
        Car car3 = new Daimler("Mercedes-Benz", "ML350", "petrol", "red", 2011);
        Car car4 = new HondaMotor("Honda", "Accord", "petrol", "green", 2014);
        Garage.parking(car1);
        Garage.parking(car2);
        Garage.parking(car1);
        Garage.parking(car4);
        Garage.departure(car1);
        Garage.parking(car3);
        Garage.parking(car1);
        Garage.parking(car4);
        Garage.departure(car2);
        System.out.println();
        System.out.println(car1 + " now in the garage: " + Garage.getCountOfCars(car1));
        System.out.println(car2 + " now in the garage: " + Garage.getCountOfCars(car2));
        System.out.println(car3 + " now in the garage: " + Garage.getCountOfCars(car3));
        System.out.println(car4 + " now in the garage: " + Garage.getCountOfCars(car4));
    }
}
