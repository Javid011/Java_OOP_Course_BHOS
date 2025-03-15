import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student(9L, "Jahangir", "Alibayev", true, 50, 2003);
        Student s2 = new Student(12L, "Firangiz", "Xanqizi", false, 75, 2000);
        Student s3 = new Student(4L, "Ali", "Huseynov", true, 100, 2002);
        Student s4 = new Student(14L, "Camila", "Jamilova", false, 99, 1940);
        Student s5 = new Student(5L, "Eltural", "Quliyev", true, 9, 1899);
        Student s6 = new Student(7L, "Dilara", "Aliyeva", false, 75, 1956);
        Student s7 = new Student(11L, "Hasan", "Zalov", true, 75, 1899);
        Student s8 = new Student(15L, "Almira", "Sahqizi", false, 50, 1999);
        Student s9 = new Student(1L, "Cemil", "Jamilov", true, 9, 1940);
        Student s10 = new Student(3L, "Leyla", "Mestagali", false, 9, 2003);
        Student s11 = new Student(2L, "Babek", "Abdullayev", true, 99, 2001);
        Student s12 = new Student(13L, "Gulnar", "Xanqizi", false, 50, 1998);
        Student s13 = new Student(8L, "Jalil", "Ismayilov", true, 100, 2000);
        Student s14 = new Student(10L, "Ibrahim", "Jamilov", true, 75, 2005);

        Student[] students = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11,s12,s13,s14};
        Comparator<Student> checker=(a,b)->{
            if(a.getGrade() != b.getGrade()){
                return Double.compare(b.getGrade(), a.getGrade());
            }
            if(a.getBirthYear() != b.getBirthYear()){
                return Integer.compare(a.getBirthYear(), b.getBirthYear());
            }
            if(a.getIsMale() != b.getIsMale()){
                return a.getIsMale()? -1 : 1;
            }
            if(!a.getSurname().equals( b.getSurname())){
                return a.getSurname().compareTo(b.getSurname());
            }
            if(!a.getName().equals( b.getName())){
                return b.getName().compareTo(a.getName());
            }
            else{
                return Long.compare(a.getId(), b.getId());
            }
        };
        Arrays.sort(students, checker);
        for (Student student : students) {
            System.out.println(student);

        }
        Arrays.sort(students);
        System.out.println("-------------------------------------------------------------------------");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}