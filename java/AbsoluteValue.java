public class AbsoluteValue {
    public static void main(String[] args) {
        int number = -15;
        int absoluteValue = (number < 0) ? -number : number;
        
        System.out.println("Absolute value of " + number + " is " + absoluteValue);
    }
}