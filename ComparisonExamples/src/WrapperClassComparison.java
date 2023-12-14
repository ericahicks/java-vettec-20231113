
public class WrapperClassComparison {
	
	public static void main(String[] args) {
		// Integer wrapper
		Integer x = 100; // reference type
		Integer y = new Integer(100); // reference type
		
		System.out.println("x == y is " + (x == y)); // Does this get auto-unboxed?
		System.out.println("x + 0 == y + 0 is " + (x + 0 == y + 0)); // Does this get auto-unboxed?
	
		// This method will always cache values in the range -128 to 127,inclusive, 
		// and may cache other values outside of this range.
		Integer z = Integer.valueOf(100);
		System.out.println("x == z is " + (x == z));
		
		int w = 100;
		System.out.println("x == w is " + (x == w));
		
		Integer wha = Integer.valueOf(300);
		Integer what = Integer.valueOf(300); // creates new value bc outside of cache range
		System.out.println("wh == wha is " + (wha == what));
		
		System.out.println("wha.equals(what) is " + wha.equals(what));
		
		System.out.println();
		System.out.println((int) Character.MIN_VALUE + "-" + (int) Character.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + "-" + Short.MAX_VALUE);
	
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.parseUnsignedInt("11111111111111111111111111111111", 2));
		System.out.println(Integer.parseInt("11111111111111111111111111111111", 2));
	}

}
