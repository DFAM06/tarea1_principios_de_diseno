public class DemoFixed {
    public static void main(String[] args) {
        WorkerFixed employee = new EmployeeFixed();
        employee.work();
        ((EmployeeFixed) employee).eat();
        ((EmployeeFixed) employee).sleep();
    }
}
