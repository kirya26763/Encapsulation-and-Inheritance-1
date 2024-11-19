public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String firstname, String lastname, int powerMagick, int distantTransgression, int intelligence, int wisdom, int wit, int creativity) {
        super(firstname, lastname, powerMagick, distantTransgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw " +
                '\'' + getFirstname() +
                " " + getLastname() + '\'' +
                ", Сила магии - " + powerMagick +
                ", дальность трансгресии - " + distantTransgression +
                "Ум " + intelligence +
                ", мудрость " + wisdom +
                ", остроумие " + wit +
                ", креативность " + creativity;
    }

    int getTotalPoint() {
        return intelligence + wisdom + wit + creativity;
    }

    public static void comparisonStudentsRavenclaw(Ravenclaw student1, Hogwarts student2) {
        if (student1.getTotalPoint() > student2.getTotalPoint()) {
            System.out.println(student1 + " лучший ученик Когтевран " + student2);
        } else if (student2.getTotalPoint() > student1.getTotalPoint()) {
            System.out.println(student2 + " лучший ученик Когтевран " + student1);
        } else {
            System.out.println("Ученики " + student1 + " и " + student2 + " равны");
        }
    }
}
