import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gryffindor[] studentsGryffindor = {
                new Gryffindor("Гари", "Потер", 89, 55, 23, 32, 45),
                new Gryffindor("Гермиона", "Грейнджер", 69, 81, 45, 62, 37),
                new Gryffindor("Рон", "Уизли", 23, 35, 12, 37, 54),
        };
        Ravenclaw[] studentsRavenclaw = {
                new Ravenclaw("Чжоу", "Чанг", 41, 61, 55, 48, 43,55),
                new Ravenclaw("Падма", "Патил", 33, 55, 66, 22, 11,66),
                new Ravenclaw("Маркус", "Белби", 48, 65, 37, 82, 26,71),
        };
        Hufflepuff[] studentsHufflepuff = {
                new Hufflepuff("Захария", "Смит", 42, 43, 44, 54, 46),
                new Hufflepuff("Седрик", "Диггори", 44, 46, 47, 48, 49),
                new Hufflepuff("Джастин", "Финч-Флетчли", 51, 52, 55, 57, 58),
        };
        Slytherin[] studentsSlytherin = {
                new Slytherin("Драко", "Малфой",32,64,32,33,46,86,54 ),
                new Slytherin("Грэхэм", "Монтегю",31,32,33,34,35,36,37),
                new Slytherin("Грегори", "Гойл", 45,38,33,42,41,40,39),
        };
        System.out.println(studentsSlytherin[0]);
        System.out.println(studentsGryffindor[0]);
        System.out.println(studentsHufflepuff[0]);
        System.out.println(studentsRavenclaw[0]);
        Hogwarts.comparisonStudents(studentsGryffindor[1],studentsSlytherin[0]);
        Gryffindor.comparisonStudentsGryffindor(studentsGryffindor[0],studentsGryffindor[1]);
        Ravenclaw.comparisonStudentsRavenclaw(studentsRavenclaw[1],studentsRavenclaw[2]);
        Hufflepuff.comparisonStudentsHufflepuff(studentsHufflepuff[0],studentsHufflepuff[2]);
        Slytherin.comparisonStudentsSlytherin(studentsSlytherin[1],studentsSlytherin[0]);
    }
}