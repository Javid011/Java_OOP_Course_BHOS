public interface Gradable {
    void findGPA();
    int takeExam(Exam exam);
    boolean takeCourse(Course course);
    void study(Course course, int hours);
}