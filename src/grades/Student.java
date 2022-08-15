package grades;

import java.util.ArrayList;

public class Student {
    private static String name;
    private static ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }

    public void addGrade(int... integers)
    {
        for (int i : integers)
        {
            grades.add(i);
        }
    }
    public double getGradeAverage(){
       int Y = grades.size();
       double gradeTotal = 0;
        for (Integer grade : grades) {
           gradeTotal += grade;
        }
        System.out.println(gradeTotal);
        return gradeTotal / Y;
    }

    protected static ArrayList getGrades() {
        return grades;
    }

}
