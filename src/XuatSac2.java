import java.util.*;

public class XuatSac2 {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 25, "Tim mạch"),
                new Patient("Hùng", 40, "Nội tiết"),
                new Patient("Mai", 30, "Tim mạch")
        );
        Map<String, List<Patient>> maps = new HashMap<>();

        for (Patient patient : patients){
            String dept = patient.getDepartment();

            if (!maps.containsKey(dept)) {
                maps.put(dept, new ArrayList<>());
            }

            maps.get(dept).add(patient);

        }

        System.out.println("Output Map Structure:");
        for (Map.Entry<String, List<Patient>> entry : maps.entrySet()) {
            System.out.println("Key \"" + entry.getKey() + "\" -> Value " + entry.getValue());
        }

        String maxDept = "";
        int maxSize = 0;

        for (Map.Entry<String, List<Patient>> entry : maps.entrySet()) {
            if (entry.getValue().size() > maxSize) {
                maxSize = entry.getValue().size();
                maxDept = entry.getKey();
            }
        }

        System.out.println("\nOutput Analysis: \"Khoa " + maxDept
                + " đang đông nhất (" + maxSize + " bệnh nhân)\"");
    }
}
