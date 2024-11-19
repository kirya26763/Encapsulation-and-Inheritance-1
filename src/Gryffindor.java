public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String firstname, String lastname, int powerMagick, int distantTransgression, int nobility, int honor, int courage) {
        super(firstname, lastname, powerMagick, distantTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Gryffindor " +
                '\'' + getFirstname() +
                " " + getLastname() + '\'' +
                ", Сила магии - " + powerMagick +
                ", дальность трансгресии - " + distantTransgression +
                " Благородство " + nobility +
                ", честь " + honor +
                ", храбрость " + courage;
    }

    int getTotalPoint() {
        return nobility + honor + courage;
    }

    public static void comparisonStudentsGryffindor (Gryffindor student1, Hogwarts student2) {
        if (student1.getTotalPoint() > student2.getTotalPoint()) {
            System.out.println(student1 + " лучший ученик Грифиндор " + student2);
        } else if (student2.getTotalPoint() > student1.getTotalPoint()) {
            System.out.println(student2 + " лучший ученик Грифиндор " + student1);
        } else {
            System.out.println("Ученики " + student1 + " и " + student2 + " равны");
        }
    }
}
