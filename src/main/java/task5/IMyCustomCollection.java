package task5;

public interface IMyCustomCollection<T> {
    void addItem(T item);

    void deleteItemByValue(T item);

    T getItemByIndex(int index);

    boolean checkContains(T item);

    void clearCollection();

    int getCurrentSize();
}
