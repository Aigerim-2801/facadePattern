public class ShiftBus implements Bus {
    @Override
    public void display() {
        System.out.println("I'm a double-decker shift bus");
    }

    @Override
    public void runFor() {
        System.out.println("I'm running for shift services");
    }

    @Override
    public void runIn() {
        System.out.println("I'm running in the intercity");
    }

    @Override
    public void fill() {
        System.out.println("I'm filling with gas");
    }
}