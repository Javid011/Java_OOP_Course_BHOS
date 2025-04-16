import java.io.File;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Murad", "Ismayilov", 20, true, 250, 230201001);
        Student s2 = new Student("Samir", "Taghiyev", 22, true, 300, 230201002);
        Student s3 = new Student("Leyla", "Mammadova", 19, false, 350, 230201003);
        Student s4 = new Student("Gulnar", "Alizade", 21, false, 400, 230201004);
        Student s5 = new Student("Rena", "Suleymanova", 20, false, 280, 230201005);

        Teacher t1 = new Teacher("Elchin", "Gadirov", 45, true, 3800, 231001);
        Teacher t2 = new Teacher("Nargiz", "Aliyeva", 37, false, 3600, 231002);

        Course java = new Course("Java", "CS101", 5);
        Course networks = new Course("Computer Networks", "CS220", 4);
        Course os = new Course("Operating Systems", "CS240", 5);
        Course linearAlgebra = new Course("Linear Algebra", "MATH210", 4);
        Course stats = new Course("Probability & Statistics", "MATH230", 6);
        Course digitalLogic = new Course("Digital Logic Design", "ECE110", 3);
        Course circuits = new Course("Basic Circuits", "ECE120", 4);
        Course philosophy = new Course("Philosophy", "PHIL101", 3);
        Course sociology = new Course("Sociology", "SOC105", 2);
        Course healthSafety = new Course("Health and Safety", "SAFE100", 2);

        s1.takeCourse(java);
        s1.takeCourse(stats);
        s1.takeCourse(philosophy);

        s2.takeCourse(os);
        s2.takeCourse(java);
        s2.takeCourse(digitalLogic);

        s3.takeCourse(philosophy);
        s3.takeCourse(circuits);
        s3.takeCourse(stats);

        s4.takeCourse(linearAlgebra);
        s4.takeCourse(digitalLogic);
        s4.takeCourse(networks);

        s5.takeCourse(circuits);
        s5.takeCourse(sociology);
        s5.takeCourse(healthSafety);

        s1.study(java, 40);

        int e1 = s1.takeExam(java.getExam());
        int e2 = s1.takeExam(stats.getExam());
        int e3 = s1.takeExam(circuits.getExam());
        int e4 = s1.takeExam(philosophy.getExam());

        t1.assignCourse(java);
        t1.assignCourse(os);

        t2.assignCourse(linearAlgebra);
        t2.assignCourse(stats);

        t1.setExam(java, 120, LocalDateTime.of(2025, 5, 5, 10, 30));
        t1.setExam(os, 90, LocalDateTime.of(2025, 5, 6, 12, 0));
        t2.setExam(linearAlgebra, 60, LocalDateTime.of(2025, 5, 7, 9, 0));
        t2.setExam(stats, 75, LocalDateTime.of(2025, 5, 8, 13, 45));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            objectMapper.writeValue(new File("student.json"), new Student[]{s1, s2, s3, s4, s5});
            objectMapper.writeValue(new File("teacher.json"), new Teacher[]{t1, t2});
            objectMapper.writeValue(new File("course.json"), new Course[]{
                    java, os, linearAlgebra, stats, digitalLogic, circuits,
                    philosophy, sociology, healthSafety, networks
            });
            objectMapper.writeValue(new File("exam.json"), new Exam[]{
                    java.getExam(), linearAlgebra.getExam(), stats.getExam()
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
