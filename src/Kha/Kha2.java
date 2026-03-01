package Kha;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kha2 {
    public static void main(String[] args) {
        Map<String,String> strings = new HashMap<>();

        strings.put("T01","Paracetamol");
        strings.put("T02","Ibuprofen");
        strings.put("T03","Mocfin");
        strings.put("T04","Paradol");
        strings.put("T05","C sủi");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String inputCode = sc.nextLine().toUpperCase();

        if (strings.containsKey(inputCode)) {
            System.out.println("Tên thuốc: " + strings.get(inputCode));
        } else {
            System.out.println("Thuốc không có trong danh mục BHYT");
        }
    }
}
