package Gioi;

import java.util.*;

public class Gioi2 {
    public static void main(String[] args) {
        List<String> sicks = Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết");

        Map<String, Integer> map = new TreeMap<>();

        for (String s : sicks) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        System.out.println("Output (đã sắp xếp):");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
