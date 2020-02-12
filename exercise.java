
public class test1 {
	// initialize global variable (default value is 0)
	private static int a;
	
	public static void main(String[] args) {
		//initialize local variable accessible only in main method
		int a = 5;
		//passing local variable a with value of 5, so x=5 here
		System.out.print(f(a));
		//passing local variable a with value of 5, x=5 also
		System.out.print(f(a));
		//passing still a local variable a with value of 5, still x=5
		System.out.print(a);
	}

	public static int f(int x) {
		//increment global variable (private static int a; - from the beginning of the class, line 4)
		//after first iteration global a=1, after second a=2
		a++;
		//in first iteration 1+5=6, in second 2+5=7
		return (a + x);
	}
}
