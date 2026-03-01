package XuatSac;

class Patient {
    private String name;
    private int severity;
    private int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public String getSeverityText() {
        switch (severity) {
            case 1: return "Nguy kịch";
            case 2: return "Nặng";
            case 3: return "Nhẹ";
            default: return "";
        }
    }

    @Override
    public String toString() {
        return name + " (Mức " + severity + " - "
                + getSeverityText() + ", đến lúc "
                + arrivalTime + ")";
    }
}