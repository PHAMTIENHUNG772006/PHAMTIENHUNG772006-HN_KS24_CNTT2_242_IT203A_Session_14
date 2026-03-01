package BaitapThucHanh;

import java.util.*;

public class PatientService implements Manageable<Patient> {

    Set<Patient> patients = new HashSet<>();

    @Override
    public void add(Patient patient) {
        patients.add(patient);
    }

    @Override
    public void update(String id, Patient newPatient) {
        Iterator<Patient> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Patient element = iterator.next();
            if (element.getId().equals(id)) {
                element.setName(newPatient.getName());
                element.setAge(newPatient.getAge());
            }
        }
    }

    @Override
    public void delete(String id) {
        Iterator<Patient> iterator = patients.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Patient element = iterator.next();
            if (element.getId().equals(id)) {
                iterator.remove();
                found = true;
            }
        }
        if (found){
            System.out.println("Xóa thành công bệnh nhân");
        }else {
            System.out.println("không tìm thấy bệnh nhân cần xóa");
        }
    }

    @Override
    public void displayAll() {
        System.out.println(" Danh sách bệnh nhân : ");
        for (Patient patient : patients){
            patient.displayInfo();
        }
    }

    public Patient findById(String id) {
        for (Patient p : patients) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public List<Patient> findByName(String keyword) {
        List<Patient> result = new ArrayList<>();
        for (Patient p : patients) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }

    public void sortByAge() {
        List<Patient> sortedList = new ArrayList<>(patients);
        sortedList.sort(Comparator.comparingInt(Patient::getAge));

        for (Patient p : sortedList) {
            p.displayInfo();
        }
    }

    public void sortById() {
        List<Patient> sortedList = new ArrayList<>(patients);
        sortedList.sort(Comparator.comparing(Patient::getId));
    }
}
