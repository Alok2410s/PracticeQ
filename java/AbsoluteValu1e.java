import java.util.Scanner;
public class AbsoluteValu1e {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
        double x = sc.nextDouble();
          System.out.println("Absolute value: " + (x < 0 ? -x : x)); 
          sc.close();
}
}

