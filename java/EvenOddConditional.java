public class EvenOddConditional {
    public static void main(String[] args) {
        int number = 7;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        
        System.out.println("Number: " + number + " is " + result);
    }
}