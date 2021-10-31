public class BusFacade {
    private SchoolBus schoolBus;
    private ShiftBus shiftBus;
    private MedicalBus medicalBus;

    public BusFacade() {
        schoolBus = new SchoolBus();
        shiftBus = new ShiftBus();
        medicalBus = new MedicalBus();
    }

    public void display() {
        schoolBus.display();
        shiftBus.display();
        medicalBus.display();
    }

    public void runFor() {
        schoolBus.runFor();
        shiftBus.runFor();
        medicalBus.runFor();
    }

    public void runIn() {
        schoolBus.runIn();
        shiftBus.runIn();
        medicalBus.runIn();
    }

    public void fill() {
        schoolBus.fill();
        shiftBus.fill();
        medicalBus.fill();
    }
}
