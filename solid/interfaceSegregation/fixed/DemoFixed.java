//Client code
public class DemoFixed {
    public static void main(String[] args) {
        WorkerFixed employee = new EmployeeFixed();
        employee.work();
        employee.eat();
        employee.sleep();
    }
}

// Fixed interface violating ISP
interface WorkerFixed {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleeping {
    void sleep();
}

// Fixed class implementing the interface
class EmployeeFixed implements WorkerFixed, Eatable, Sleeping {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Employee is sleeping");
    }
}

class RobotOriginal implements WorkerFixed {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}