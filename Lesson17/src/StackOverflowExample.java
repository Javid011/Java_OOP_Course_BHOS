public class StackOverflowExample {
    public static void recursiveMethod() {
        recursiveMethod();
    }
    public static void main(String[] args) {
        try {
            recursiveMethod();
        }
        catch (Exception e) {
            System.out.println("Stack Overflow");
        }
    }
}
