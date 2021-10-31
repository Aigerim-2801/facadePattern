public class SchoolBus implements Bus {
    @Override
    public void display() {
        System.out.println("I'm school bus");
    }

    @Override
    public void runFor() {
        System.out.println("I'm running for school services");
    }

    @Override
    public void runIn() {
        System.out.println("I'm running in the city");
    }

    @Override
    public void fill() {
        System.out.println("I'm filling with gasoline");
    }
}
