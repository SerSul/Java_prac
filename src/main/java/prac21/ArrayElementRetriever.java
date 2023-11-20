package prac21;

public class ArrayElementRetriever {
    public static <T> T getElementAtIndex(T[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three"};
        String element = getElementAtIndex(stringArray, 1);
        System.out.println(element);

        Integer[] intArray = {1, 2, 3, 4, 5};
        Integer intElement = getElementAtIndex(intArray, 3);
        System.out.println(intElement);
    }
}

