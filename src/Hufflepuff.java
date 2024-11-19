public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstname, String lastname, int powerMagick, int distantTransgression, int hardWork, int loyalty, int honesty) {
        super(firstname, lastname, powerMagick, distantTransgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff " +
                '\'' + getFirstname() +
                " " + getLastname() + '\'' +
                ", Сила магии - " + powerMagick +
                ", дальность трансгресии - " + distantTransgression +
                "трудолюбие " + hardWork +
                ", верность " + loyalty +
                ", честность " + honesty;
    }

    int getTotalPoint() {
        return hardWork + loyalty + honesty;
    }

    public static void comparisonStudentsHufflepuff(Hufflepuff student1, Hogwarts student2) {
        if (student1.getTotalPoint() > student2.getTotalPoint()) {
            System.out.println(student1 + " лучший ученик Пуффендуй " + student2);
        } else if (student2.getTotalPoint() > student1.getTotalPoint()) {
            System.out.println(student2 + " лучший ученик Пуффендуй " + student1);
        } else {
            System.out.println("Ученики " + student1 + " и " + student2 + " равны");
        }
    }
}
