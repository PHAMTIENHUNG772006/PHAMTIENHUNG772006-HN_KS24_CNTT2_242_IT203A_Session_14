package BaitapThucHanh;
import java.util.*;

public class MedicalRecordService {
    private Map<String, List<MedicalRecord>> recordMap = new HashMap<>();

    public void addRecord(String patientId, MedicalRecord record) {
        recordMap.putIfAbsent(patientId, new ArrayList<>());
        recordMap.get(patientId).add(record);
        System.out.println("Thêm hồ sơ thành công");
    }

    public void deleteRecord(String patientId, String recordId) {
        List<MedicalRecord> records = recordMap.get(patientId);
        boolean found = false;
        if (records != null) {
            records.removeIf(r -> r.getRecordId().equals(recordId));
            found = true;
        }
        if (found){
            System.out.println("Xóa thành công bệnh nhân");
        }else {
            System.out.println("không tìm thấy bệnh nhân cần xóa");
        }
    }

    public void displayRecords(String patientId) {
        List<MedicalRecord> records = recordMap.get(patientId);
        if (records != null) {
            System.out.println("Hồ sơ của bệnh nhân " + patientId + ":");
            for (MedicalRecord r : records) {
                System.out.println(r.getRecordId() + " - " + r.getDiagnosis() + " - " + r.getDate());
            }
        } else {
            System.out.println("Không có hồ sơ cho bệnh nhân này.");
        }
    }
}