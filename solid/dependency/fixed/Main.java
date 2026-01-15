public class Main {

    public static void main(String args[]) {
        
        CarFixed jeep = new CarFixed(new CombustionInternal());
        jeep.start();

        CarFixed cyberTruck = new CarFixed(new Electric());
        cyberTruck.start();
    }
}
