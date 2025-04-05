public class OutOfMemoryExample {
    public static void main(String[] args) {
        try {
                int[] largeArray = new int[100000 * 100000];
                System.out.println("Allocated memory");
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
        }
    }
}
