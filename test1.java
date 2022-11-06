import java.util.Scanner;
//import org.mockito.Mockito.mock;
//import org.mockito.Mockito.when;
import org.junit.Test;
public class test1 {
	public static void main(String[] args) {
		Algebra Algebra = new Algebra();
		System.out.println("hello world");
		System.out.println(Algebra.addNumbers(5,6));
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number of the screen you want ot visit Main(1),About(2),Help(3)");
		int input= S.nextInt(); 
		System.out.println(input);
		if(input == 1) {
			//Stub
			System.out.println("This is the main Screen");
		}
		else if(input==2) {
			//Stub
			System.out.println("This is the about Screen");
		}
		else if(input==3) {
			//Stub
			System.out.println("This is the help Screen");
		}
		else {
			//Stub
			System.out.println("This is not an option");
		}
	}
	@Test	
	public void mySampleTest() {
		System.out.println("hi this is my junit");
	}
}