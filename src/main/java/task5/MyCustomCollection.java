package task5;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.copyOf;

/**
 * A class that simulates the operation of a dynamic collection class
 */
public class MyCustomCollection<T> {
    private T[] collection;
    private static final int DEFAULT_CAPACITY = 10;

    public MyCustomCollection() {
        this.collection = (T[]) Array.newInstance(Object.class, DEFAULT_CAPACITY);
    }

    public MyCustomCollection(int capacity) {
        this.collection = (T[]) Array.newInstance(Object.class, capacity);
    }

    public T[] getCollection() {
        return collection;
    }

    public void addItem(T newItem) {
        try {
            if (collection.length * 0.75 <= getCurrentSize()) {
                collection = copyOf(collection, collection.length * 2);
            }
            collection[getCurrentSize()] = newItem;
        } catch (Exception ex) {
            System.out.println("Something went wrong =(");
        }
    }

    public void deleteItemByValue(T item) {
        if (checkContains(item)) {
            collection = ArrayUtils.removeElement(collection, item);
            collection = copyOf(collection, collection.length + 1);
        } else {
            System.out.println("Element " + item + " not found");
        }
    }

    public T getItemByIndex(int index) {
        try {
            return ArrayUtils.get(collection, index);
        } catch (Exception ex) {
            System.out.println("No such index");
            return null;
        }
    }

    public boolean checkContains(T item) {
        return ArrayUtils.contains(collection, item);
    }

    public void clearCollection() {
        collection = (T[]) Array.newInstance(Object.class, collection.length);
    }

    public int getCurrentSize() {
        int count = 0;
        for (T item : collection) {
            if (item != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * Using for demonstration of custom collection
     */
    public static void MyCustomCollectionDemo() {
        MyCustomCollection<Integer> myCollection = new MyCustomCollection<>(2);
        myCollection.addItem(2);
        myCollection.addItem(3);
        System.out.println(myCollection);
        System.out.println("-->>add elements with next values: 4, 5");
        myCollection.addItem(4);
        myCollection.addItem(5);
        System.out.println(myCollection);
        System.out.println("<<--delete element with next value: 4");
        myCollection.deleteItemByValue(4);
        System.out.println(myCollection);
        System.out.println("----is collection contains elements with next values: 3?");
        if (myCollection.checkContains(3)) {
            System.out.println("The collection contains item");
        } else {
            System.out.println("The collection does not contain an item");
        }
        System.out.println("<<<<clear collection");
        myCollection.clearCollection();
        System.out.println(myCollection);
    }

    @Override
    public String toString() {
        return "MyCustomCollection{" +
                "collection=" + Arrays.toString(collection) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCustomCollection<?> that = (MyCustomCollection<?>) o;
        return Arrays.equals(collection, that.collection);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(collection);
    }
}
