public class Main {

    public static void main(String[] args) {
        BusFacade busFacade = new BusFacade();
        busFacade.display();
        System.out.println();
        busFacade.runFor();
        System.out.println();
        busFacade.runIn();
        System.out.println();
        busFacade.fill();
    }
}
