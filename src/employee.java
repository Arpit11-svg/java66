public class employee {
    int empId;
    String empName;
    double empSalary;

    public employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public void display(){
        System.out.println("Employee name is : " + empName);
        System.out.println("Employee ID is : " + empId);
        System.out.println("Employee salary is : "+empSalary);
    }
}
