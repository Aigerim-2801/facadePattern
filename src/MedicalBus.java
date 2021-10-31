public class MedicalBus implements Bus {
    @Override
    public void display() {
        System.out.println("I'm a medical bus");
    }

    @Override
    public void runFor() {
        System.out.println("I'm running for medical services");
    }

    @Override
    public void runIn() {
        System.out.println("I'm running in the city, also in the intercity");
    }

    @Override
    public void fill() {
        System.out.println("I'm filling with fuel");
    }
}