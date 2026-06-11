import java.util.Scanner;
public class GreatestOfFourNested {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter four numbers: ");
int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
int max;
if (a >= b && a >= c && a >= d) max = a;
else if (b >= c && b >= d) max = b;
else if (c >= d) max = c;
else max = d;
System.out.println("Greatest: " + max);
sc.close();
}
}