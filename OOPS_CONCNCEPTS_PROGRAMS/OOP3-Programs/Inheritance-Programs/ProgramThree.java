class Employee {
    public void work() {
        System.out.println("Employee is working");
    }
    public double getSalary() {
        return 0;
    }
}

class HRManager extends Employee{
    @Override
    public void work() {
        System.out.println("HR Manager is working on employee relations");
    }
    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
}
class ProgramThree{
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();
        System.out.println("HR Manager's salary: " + hr.getSalary());
    }
}
