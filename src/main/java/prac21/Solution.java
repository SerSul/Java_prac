package prac21;

import java.util.*;

public class Solution<T, K, V> {
    private T variableOfTypeT;
    private K variableOfTypeK;
    private V variableOfTypeV;

    public Solution(T variableOfTypeT, K variableOfTypeK, V variableOfTypeV) {
        this.variableOfTypeT = variableOfTypeT;
        this.variableOfTypeK = variableOfTypeK;
        this.variableOfTypeV = variableOfTypeV;
    }

    public static <T> List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values arrays must have the same length");
        }

        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {

        List<Integer> integerList = newArrayList(1, 2, 3, 4, 5);
        System.out.println("New Integer List: " + integerList);

        HashSet<String> stringSet = newHashSet("one", "two", "three");
        System.out.println("New String Set: " + stringSet);

        String[] keys = {"key1", "key2", "key3"};
        Integer[] values = {1, 2, 3};
        HashMap<String, Integer> hashMap = newHashMap(keys, values);
        System.out.println("New HashMap: " + hashMap);
    }
}

