package Modul2.Tugas1;

class Doctor {
    private static final double BONUS_RATE = 0.08;
    private String name;
    private int id;
    private double salary;
    private String spesialization;

    public Doctor(String name, int id, double salary,String spesialization){
        this.setName(name);
        this.id = id;
        this.salary = salary;
        this.spesialization = spesialization;
    }

    public void applyBonus(){
        salary += calculateBonus();
        System.out.println("Bonus applied! New salary: " + salary);
    }

    private double calculateBonus() {
        double bonus = salary * BONUS_RATE;
        return bonus;
    }

    public void printDetails(){
        System.out.println("Doctor ID : "+ id);
        System.out.println("Name: " + getName());
        System.out.println("Spesialization: " + spesialization);
        System.out.println("Salary: $" + salary);
    }

    public void updateSpesialization(String newSpesialization){
        spesialization = newSpesialization;
        System.out.println("Spesialization updated to: " + spesialization);
    }

    String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}

class Patient{
    public String name;
    public int recordNumber;
    public Doctor doctor;
    public String disease;

    public Patient(String name, int recordNumber, Doctor doctor, String disease){
        this.name = name;
        this.recordNumber = recordNumber;
        this.doctor = doctor;
        this.disease = disease;
    }

    public void printPatientDetails(){
        System.out.println("Patient name: " + name);
        System.out.println("Patient Number: " + recordNumber);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor in Charge: " + doctor.getName());
    }

    public void updateDisease(String newDisease){
        disease = newDisease;
        System.out.println("Disease update to: " + disease);
    }
}

class Hospital {
    public String hospitalName;
    public String address;
    public Patient patient;

    public Hospital(String hospitalName, String address, Patient patient) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.patient = patient;
    }

    public void printHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Address: " + address);
        patient.printPatientDetails();
    }
}


