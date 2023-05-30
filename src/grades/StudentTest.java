package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student tyresz = new Student("Tyresz");
        tyresz.addGrade(80);
        tyresz.addGrade(100);
        tyresz.addGrade(80);
        System.out.println(tyresz.getGradeAverage());
    }
}
