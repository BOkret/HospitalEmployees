public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.addEmployee(new Doctor("Kasia", "Em", 3000, 250));
        hospital.addEmployee(new Nurse("Karo", "Ba", 2000, 10));
        hospital.addEmployee(new Nurse("Ewa", "Pi", 2300, 5));

        hospital.printInfo();
    }
}
