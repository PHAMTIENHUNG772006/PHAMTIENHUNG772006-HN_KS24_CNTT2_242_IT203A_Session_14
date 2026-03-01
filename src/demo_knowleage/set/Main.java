package demo_knowleage.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // set kế thùa Colection
        // không lưu trữ các phần tử trùng lặp

        // 4 lớp triển khai :
        //HashSet ( không xác định thứ tự )
        //LinkedHashSet ( giống danh sách liên kết )
        // TreeSet ( được săp xếp, cây nhị phân )
        // Mặc định là tăng dần nếu giảm dùng  Comparetor.reverseOrder()
        // EnumSet (nhẹ và nhanh khi tìm kiếm) chuỗi hằng

        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new TreeSet<>();
//        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = EnumSet.of(1, 2);


        set.add(10);
        set.add(20);
        set.add(110);
        set.add(55);

        // các phương thức làm việc


    }
}
