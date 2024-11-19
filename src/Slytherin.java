public class Slytherin extends Hogwarts {
    private int cunning;
    private int attentiveness;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String firstname, String lastname, int powerMagick, int distantTransgression, int cunning,
                     int attentiveness, int ambition, int resourcefulness, int thirstForPower) {
        super(firstname, lastname, powerMagick, distantTransgression);
        this.cunning = cunning;
        this.attentiveness = attentiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getAttentiveness() {
        return attentiveness;
    }

    public void setAttentiveness(int attentiveness) {
        this.attentiveness = attentiveness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin " +
                '\'' + getFirstname() +
                " " + getLastname() + '\'' +
                ", Сила магии - " + powerMagick +
                ", дальность трансгресии - " + distantTransgression +
                " хитрость " + cunning +
                ", решительность " + attentiveness +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + thirstForPower;
    }

    int getTotalPoint() {
        return cunning + attentiveness + ambition + resourcefulness + thirstForPower;
    }

    public static void comparisonStudentsSlytherin(Slytherin student1, Hogwarts student2) {
        if (student1.getTotalPoint() > student2.getTotalPoint()) {
            System.out.println(student1 + " лучший ученик Слизерин " + student2);
        } else if (student2.getTotalPoint() > student1.getTotalPoint()) {
            System.out.println(student2 + " лучший ученик Слизерин " + student1);
        } else {
            System.out.println("Ученики " + student1 + " и " + student2 + " равны");
        }
    }
}
