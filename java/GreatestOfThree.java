import java.util.Scanner;
public class GreatestOfThree {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter three numbers: ");
int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
int max = Math.max(a, Math.max(b, c));
System.out.println("Greatest: " + max);
sc.close();
}
}