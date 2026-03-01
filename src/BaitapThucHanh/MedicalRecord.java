package BaitapThucHanh;

import java.util.List;
import java.util.Map;

public class MedicalRecord {
    private String recordId;

    private String diagnosis;

    private String date;

    public MedicalRecord(String recordId, String diagnosis, String date) {
        this.recordId = recordId;
        this.diagnosis = diagnosis;
        this.date = date;
    }

    public MedicalRecord() {

    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    Map<String, List<MedicalRecord>> recordMap;



}
