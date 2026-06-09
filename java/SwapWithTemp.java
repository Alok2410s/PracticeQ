// WAP to swap two numbers using a third variable.

public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("Before: a = " + a + ", b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After: a = " + a + ", b = " + b);
    }
}