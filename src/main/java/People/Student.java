package People;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
        private int credits;
    private int student_id;
    private List<Integer> grades;

        public Student(String name, String address) {
            super(name, address);
            this.student_id = 0;
            this.grades = new ArrayList<>();
            this.credits = 0;
        }

        public int credits() {
            return credits;
        }

        public void study() {
            credits++;
        }
        public int getStudentId() {return student_id;}

        public void setStudentId(int student_id) {
            this.student_id = student_id;
        }

        public List<Integer> getGrades() {return grades;}

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Grades should be between 0 and 100.");
        }
    }

        public String toString() {

            StringBuilder gradesString = new StringBuilder();
            for (int grade : grades) {
                gradesString.append(grade).append(", ");
            }

            if (!grades.isEmpty()) {
                gradesString.setLength(gradesString.length() - 2); // Remove the trailing ", "
            } else {
                gradesString.append("No grades available.");
            }
            return super.toString() + "\n" + "Student credits: " + credits + "\nStudent ID: " + student_id + "\nGrades: " + gradesString;
        }

        public static void main(String[] args) {
            Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
            System.out.println(olli);
            System.out.println("credits " + olli.credits());
            olli.study();
            System.out.println("credits " + olli.credits());
        }
    }