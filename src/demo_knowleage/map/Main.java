package demo_knowleage.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // lưu trữ các cặp key - value ( key không trùng lặp )

        // 4 lớp phát triển :
        // HashMap
        //LinkedHasMap
        // TreeMap
        //EnumMap


        Map<String,String> map = new HashMap<>();

        map.put("Phone","Iphone15 Promax");
        map.put("Phone","Iphone17 Promax");
        map.put("Phone","Iphone 7 plus");

        System.out.println(map);


        System.out.println(map.containsKey("Phone"));;
        System.out.println(map.containsValue("Iphone 7 plus"));;


        //duyetejt collection
        // 3 cách duyệt
        // theo key

        for (String key : map.keySet()){
            // làm việc với key
        }

        // theo value
        for (String key : map.values()){
            // làm việc với value
        }

        // theo cả hai
        for (Map.Entry<String,String> entry : map.entrySet()){
            // làm việc với cả hai
            String keky = entry.getKey();

            String value = entry.getValue();
        }
    }
}
