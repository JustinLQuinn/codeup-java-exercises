package grades;

public class StudentTest {


    public static void main(String[] args) {
Student Matt = new Student("Matt");
Matt.addGrade(32);
Matt.addGrade(56);
Matt.addGrade(32, 68, 89, 73, 92);
        System.out.println(Matt.getGrades());
//        System.out.println(Matt.getGradeAverage());
    }

}
