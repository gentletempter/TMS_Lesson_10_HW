package task3;

import java.util.Date;

/**
 * Using next rules:
 * 1) Don’t provide “setter” methods — methods that modify fields or objects referred to by fields;
 * 2) Make all fields final and private;
 * 3) Don’t allow subclasses to override methods;
 * 4) Special attention when having mutable instance variables
 */
public final class MyImmutableClass {
    private final String name;
    private final Integer age;
    private final Date registrationDate;

    private MyImmutableClass(String name, Integer age, Date registrationDate) {
        this.name = name;
        this.age = age;
        this.registrationDate = new Date(registrationDate.getTime());
    }

    /**
     * Using Factory method
     */
    public static MyImmutableClass createNewInstance(String name, Integer age, Date registrationDate) {
        return new MyImmutableClass(name, age, registrationDate);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Date getRegistrationDate() {
        return new Date(registrationDate.getTime());
    }

    @Override
    public String toString() {
        return name + " | " + age + " | " + registrationDate;
    }
}
