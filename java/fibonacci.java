public class fibonacci {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n = sc.nextInt();
		int a = 0, b = 1;

		System.out.print("Fibonacci series: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
		sc.close();
	}
}
