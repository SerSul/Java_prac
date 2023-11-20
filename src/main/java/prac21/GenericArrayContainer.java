package prac21;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class GenericArrayContainer<T> {
    private final T[] array;

    public GenericArrayContainer(T[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArrayContainer<Integer> intContainer = new GenericArrayContainer<>(intArray);
        Integer[] retrievedIntArray = intContainer.getArray();
        System.out.println(Arrays.toString(retrievedIntArray));

        String[] stringArray = {"one", "two", "three"};
        GenericArrayContainer<String> stringContainer = new GenericArrayContainer<>(stringArray);
        String[] retrievedStringArray = stringContainer.getArray();
        System.out.println(Arrays.toString(retrievedStringArray));
    }
}

