public class CustomException {
    public static void main(String[] args) throws NotSameNumber {
        validateNumber(String.valueOf(20));
    }
    public static void validateNumber(String number) throws NotSameNumber{
        if(!number.equals(30)){
            throw new NotSameNumber("It is not the same number");
        }
    }
}