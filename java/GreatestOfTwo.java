import java.util.Scanner;
public class GreatestOfTwo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter two numbers: ");
int a = sc.nextInt(), b = sc.nextInt();
System.out.println("Greatest: " + (a > b ? a : b));
sc.close();
}
}