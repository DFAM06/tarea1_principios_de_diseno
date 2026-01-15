public class CarFixed {

    private Engine engine;

    public CarFixed(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        
        engine.start();
        System.out.println("Running car");
    }
}

