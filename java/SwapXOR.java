public class SwapXOR {
    public static void main(String[] args) {
        int a = 12;
        int b = 25;
        
        System.out.println("Before: a = " + a + ", b = " + b);
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After: a = " + a + ", b = " + b);
    }
}