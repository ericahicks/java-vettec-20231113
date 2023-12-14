
public class SwitchStatementDefaultExamples {
	
	public static void main(String[] args) {
		// default in the middle
		int x = 1; // prints 1
//		int x = 0; // prints 0 default 1
//		int x = 2; // prints default 1
		switch (x) {
		case 0: System.out.println(0);
		default: System.out.println("default");
		case 1: System.out.println(1);
		}
		System.out.println();
		
		// default in the middle 
		x = -1;
		switch (x) {
		case 0: System.out.println(0);
		case 1: System.out.println(1);
		default: System.out.println("good");
			break;
		case -1: System.out.println(-1);
		}
		System.out.println();
		
		// switch on an Integer
		Integer y = 200;
		switch (y) {
		case 100: System.out.println(100); break;
		case 200: System.out.println(200); break;
		case 300: System.out.println(300); break;
		}
		
		
	}

}
