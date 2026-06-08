import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number:");
        int a=sc.nextInt(), b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum is: "+c);
        sc.close();
    }
}
