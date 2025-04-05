public class StackOverFlowException{
    public static void main(String[] args) {
        try {
            int[] mynumbers = {1, 2, 3};
            int a = 5/0;
            System.out.println(mynumbers[10]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (Exception e) {
            System.out.println("There's something went wrong");
        }
    }
}