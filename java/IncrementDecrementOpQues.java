public class IncrementDecrementOpQues{
	static public void main(String s[]){
		int a=10,b;
		//b=++a-a;
		//b=++a-a+a++;
		//b=a--+a++-a+a++;
		//b=--a+a++-a--+a;
		//b=a++-++a+a--+a--+--a;
		//b=++a*a--+a--*--a;
		//b=--a+a++-a;
		//b=a++-++a-a--;
		//b=--a*a++/++a-a++-a--;
		b=--a*a++/a--%a--+--a*a;
		System.out.println(a);
		System.out.println(b);

//topic 5
        // int x=10;
		// x=x++;
		// System.out.println(x);

//topic 4
       		//int a=10,b;
//		b=a++-5;
//		b=a++-a;
//		b=++a-a+a++;
//		b=--a+a++-a++-a;
//		b=a--+--a+a--+a++;
//		b=a--*a/3+a++%a*5/a--;
		//b=--a*a+--a/a--%a++/a--+--a+a*a++%--a+a--;
//		b=a+++a; // a++ +a
//		b=a++++a;//error
//		b=a+++++a;//error
//		b=a+++ ++a;
//		b=a++-++a;
		//System.out.println(a);
		//System.out.println(b);

//topic 3
     		b=a++;
//		b=++a;
//		b=++a++;//error
		System.out.println(a);
		System.out.println(b);

	}
}