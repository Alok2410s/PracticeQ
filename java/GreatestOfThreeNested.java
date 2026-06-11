import java.util.Scanner;
public class GreatestOfThreeNested {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter three numbers: ");
int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
int max;
if (a >= b) {
if (a >= c) max = a; else max = c;
} else {
if (b >= c) max = b; else max = c;
}
System.out.println("Greatest: " + max);
sc.close();
}
}