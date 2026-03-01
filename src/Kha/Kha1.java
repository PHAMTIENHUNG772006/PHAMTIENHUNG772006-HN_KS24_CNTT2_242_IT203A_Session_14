package Kha;

import java.util.*;

public class Kha1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Nguyễn Văn A – Yên Bái", "Trần Thị B – Thái Bình", "Nguyễn Văn A – Yên Bái", "Lê Văn C – Hưng Yên"));

        Set<String> setList = new LinkedHashSet<>(strings);

        System.out.println(setList);
    }
}
