package Gioi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Gioi1 {
    public static void main(String[] args) {
    ArrayList<String> medicals = new ArrayList<>(Arrays.asList("Aspirin","Caffeine","Paracetamol"));
    ArrayList<String> allergyMedication = new ArrayList<>(Arrays.asList("Penicillin","Aspirin","Pollen"));

    allergyMedication.retainAll(medicals);

    System.out.println("Cảnh báo dị ứng: " + allergyMedication);

    medicals.removeAll(allergyMedication);

    System.out.println("Thành phần an toàn: " + medicals);
    }
}
