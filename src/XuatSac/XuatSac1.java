package XuatSac;
import java.util.*;

public class XuatSac1 {
        public static void main(String[] args) {
            Comparator<Patient> comparator = (p1, p2) -> {
                if (p1.getSeverity() != p2.getSeverity()) {
                    return p1.getSeverity() - p2.getSeverity();
                }
                return p1.getArrivalTime() - p2.getArrivalTime();
            };

            TreeSet<Patient> queue = new TreeSet<>(comparator);

            queue.add(new Patient("Bệnh nhân A", 3, 800));
            queue.add(new Patient("Bệnh nhân B", 1, 815));
            queue.add(new Patient("Bệnh nhân C", 1, 805));

            System.out.println("Output (Thứ tự xử lý):");
            for (Patient p : queue) {
                System.out.println(p);
            }
        }

}
