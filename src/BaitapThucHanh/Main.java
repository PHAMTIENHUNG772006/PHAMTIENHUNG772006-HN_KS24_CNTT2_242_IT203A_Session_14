package BaitapThucHanh;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientService patientService = new PatientService();
        MedicalRecordService recordService = new MedicalRecordService();

        int choice;
        do {
            System.out.println("========= QUẢN LÝ PHÒNG KHÁM =========");
            System.out.println("1. Thêm bệnh nhân");
            System.out.println("2. Cập nhật bệnh nhân");
            System.out.println("3. Xóa bệnh nhân");
            System.out.println("4. Hiển thị danh sách bệnh nhân");
            System.out.println("------------------------------------");
            System.out.println("5. Thêm hồ sơ khám bệnh");
            System.out.println("6. Xem hồ sơ theo bệnh nhân");
            System.out.println("7. Xóa hồ sơ khám");
            System.out.println("------------------------------------");
            System.out.println("8. Tìm bệnh nhân");
            System.out.println("9. Sắp xếp bệnh nhân");
            System.out.println("------------------------------------");
            System.out.println("0. Thoát chương trình");
            System.out.println("====================================");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine(); // bỏ dòng thừa

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phone = sc.nextLine();
                    Patient p = new Patient(id, name, age, phone);
                    patientService.add(p);
                    break;

                case 2:
                    System.out.print("Nhập ID bệnh nhân cần cập nhật: ");
                    String updateId = sc.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập số điện thoại mới: ");
                    String newPhone = sc.nextLine();
                    Patient newPatient = new Patient(updateId, newName, newAge, newPhone);
                    patientService.update(updateId, newPatient);
                    break;

                case 3:
                    System.out.print("Nhập ID bệnh nhân cần xóa: ");
                    String deleteId = sc.nextLine();
                    patientService.delete(deleteId);
                    break;

                case 4:
                    patientService.displayAll();
                    break;

                case 5:
                    System.out.print("Nhập patientId: ");
                    String patientId = sc.nextLine();
                    System.out.print("Nhập recordId: ");
                    String recordId = sc.nextLine();
                    System.out.print("Nhập chẩn đoán: ");
                    String diagnosis = sc.nextLine();
                    System.out.print("Nhập ngày khám: ");
                    String date = sc.nextLine();
                    MedicalRecord record = new MedicalRecord(recordId, diagnosis, date);
                    recordService.addRecord(patientId, record);
                    break;

                case 6:
                    System.out.print("Nhập patientId để xem hồ sơ: ");
                    String viewId = sc.nextLine();
                    recordService.displayRecords(viewId);
                    break;

                case 7:
                    System.out.print("Nhập patientId: ");
                    String pid = sc.nextLine();
                    System.out.print("Nhập recordId cần xóa: ");
                    String rid = sc.nextLine();
                    recordService.deleteRecord(pid, rid);
                    break;

                case 8:
                    System.out.println("Tìm bệnh nhân:");
                    System.out.println("1. Theo ID");
                    System.out.println("2. Theo tên gần đúng");
                    int searchChoice = sc.nextInt();
                    sc.nextLine();

                    if (searchChoice == 1) {
                        System.out.print("Nhập ID: ");
                        String searchId = sc.nextLine();
                        Patient found = patientService.findById(searchId);
                        if (found != null) {
                            System.out.println("Kết quả:");
                            found.displayInfo();
                        } else {
                            System.out.println("Không tìm thấy bệnh nhân với ID này.");
                        }
                    } else if (searchChoice == 2) {
                        System.out.print("Nhập tên hoặc từ khóa: ");
                        String keyword = sc.nextLine();
                        List<Patient> results = patientService.findByName(keyword);
                        if (!results.isEmpty()) {
                            System.out.println("Kết quả:");
                            for (Patient pa : results) {
                                pa.displayInfo();
                            }
                        } else {
                            System.out.println("Không tìm thấy bệnh nhân nào khớp.");
                        }
                    } else {
                        System.out.println("Lựa chọn không hợp lệ.");
                    }

                    break;
                case 9:
                    System.out.println("Sắp xếp bệnh nhân:");
                    System.out.println("1. Theo tuổi");
                    System.out.println("2. Theo ID");
                    int sortChoice = sc.nextInt();
                    sc.nextLine();

                    switch (sortChoice) {
                        case 1:
                            patientService.sortById();
                            break;
                        case 2:
                            patientService.sortByAge();
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }

                    System.out.println("Danh sách sau khi sắp xếp:");
                    patientService.displayAll();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        sc.close();
    }
}