public class DemoFixed {
    public static void main(String[] args) {
        WorkerFixed employee = new EmployeeFixed();
        WorkerFixed robot = new RobotFixed();
        employee.work();
        ((EmployeeFixed) employee).eat();
        ((EmployeeFixed) employee).sleep();
        robot.work();
    }
}
