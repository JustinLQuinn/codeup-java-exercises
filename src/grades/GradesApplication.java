package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student Matt = new Student("Matt");
        Matt.addGrade(89,72,95,65);
//        System.out.println(Matt);
        students.put("matt.phd32", Matt);

        Student Katie = new Student("Katie");
        Katie.addGrade(75,82,96,95);
        students.put("katie.phd48", Katie);

        Student John = new Student("John");
        John.addGrade(75,82,96,95);
        students.put("john.phd15", John);

        Student Mary = new Student("Mary");
        Mary.addGrade(89,92,96,94);
        students.put("Mary.phd69", Mary);

        System.out.println(students);


    }
}
