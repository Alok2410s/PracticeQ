public class FindMedian {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int c = 20;

        int median = (a > b) 
            ? ((b > c) ? b : (a > c ? c : a)) 
            : ((a > c) ? a : (b > c ? c : b));

        System.out.println("Values: " + a + ", " + b + ", " + c);
        System.out.println("Median value is: " + median);
    }
}