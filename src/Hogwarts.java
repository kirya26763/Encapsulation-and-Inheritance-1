public class Hogwarts {
    private String firstname;
    private String lastname;
    public int powerMagick;
    public int distantTransgression;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getPowerMagick() {
        return powerMagick;
    }

    public void setPowerMagick(int powerMagick) {
        this.powerMagick = powerMagick;
    }

    public int getDistantTransgression() {
        return distantTransgression;
    }

    public void setDistantTransgression(int distantTransgression) {
        this.distantTransgression = distantTransgression;
    }

    public Hogwarts(String firstname, String lastname, int powerMagick, int distantTransgression) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.powerMagick = powerMagick;
        this.distantTransgression = distantTransgression;


    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                '\'' + firstname +
                " " + lastname + '\'' +
                ", Сила магии - " + powerMagick +
                ", дальность трансгресии - " + distantTransgression +
                '}';
    }

    int getTotalPoint() {
        return powerMagick + distantTransgression;
    }

    public static void comparisonStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getTotalPoint() > student2.getTotalPoint()) {
            System.out.println(student1 + " обладает более мощьной магией, в сравнении с " + student2);
        } else if (student2.getTotalPoint() > student1.getTotalPoint()) {
            System.out.println(student2 + " обладает более мощьной магией, в сравнении с " + student1);
        } else {
            System.out.println("Ученики " + student1 + " и " + student2 + " равны");
        }
    }
}
