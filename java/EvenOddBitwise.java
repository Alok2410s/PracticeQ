public class EvenOddBitwise {
    public static void main(String[] args) {
        int number = 13;
        String result = ((number & 1) == 0) ? "Even" : "Odd";
        
        System.out.println("Number " + number + " is " + result);
    }
}