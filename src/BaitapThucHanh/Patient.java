package BaitapThucHanh;

public class Patient extends Person implements Comparable<Patient> {
    private String phone;
    public Patient(String id , String name,int age ,String phone) {
        super(id,name,age);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void displayInfo() {
        System.out.printf(" ID : %S | Tên : %s | Tuổi : %d \n",super.getId(),super.getName(),super.getAge());
    }

    @Override
    public int compareTo(Patient o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return this.getId().equals(p.getId());
    }

    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }


}
