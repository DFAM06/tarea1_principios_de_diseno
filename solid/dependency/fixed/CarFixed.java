public class CarFixed {

    private Engine engine;

    public CarFixed(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Running car");
        engine.start();
    }
}

interface Engine {

    void start();

}

class CombustionInternal implements Engine {
    
    @Override
    public void start() {
        System.out.println("Engine started.");
    }
}

class Electric implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine started.");
    }
}

class Main {

    public static void main(String args[]) {
        
        CarFixed jeep = new CarFixed(new CombustionInternal());
        jeep.start();

        CarFixed cyberTruck = new CarFixed(new Electric());
        cyberTruck.start();
    }
}
