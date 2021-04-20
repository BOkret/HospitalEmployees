public class Hospital {
    private int employeesNumber = 0;
    private static final int MAX_EMPLOYEES = 3;

    private Person[] hospitalEmployees = new Person[MAX_EMPLOYEES];

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }


    public void addEmployee(Person employee){
        if (employeesNumber < MAX_EMPLOYEES){
            hospitalEmployees[employeesNumber] = employee;
            employeesNumber++;
        } else
            System.out.println("W szpitalu pracuje już wystarczająco osób");
    }

    public void printInfo(){
        for (int i = 0; i < employeesNumber; i++) {
            System.out.println(hospitalEmployees[i].getInfo());
        }
    }
}
