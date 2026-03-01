package demo_knowleage.map;

import java.util.*;

public class baitap {

    public static boolean isCheck(ArrayList arr, int value) {
        for (Object a : arr) {
            if (a.hashCode() == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // tạo một list ngẫu nhiên từ 1-1000
        // đếm số lượng các phần tử


        Random rad = new Random();
        ArrayList<Integer> arrays = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int value = rad.nextInt(1000);
            arrays.add(value);
        }

//        for (int i = 0; i < 100; i++) {
//            System.out.println(arrays.get(i));
//        }

        Set<Integer> set = new HashSet<>(arrays);

        System.out.println(set.size());

        Map<Integer,Integer> map = new HashMap<>();

        for (Integer item : arrays) {
            if (!map.containsKey(item)){
                map.put(item,1);
            }else {
                map.put(item,map.get(item) + 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.printf("Số %d xuất hiện : %d lần \n",entry.getKey(),entry.getValue());
        }
    }
}
