/**
 * 
 */
package basic;

/**
 * @author garvitkhandelwal
 * @since 10-Dec-2022
 */
public class Factorial {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println(factorial(5));

	}
	
	/**
	 * 
	 * @param fact
	 * @return int
	 */
	public static int factorial (int fact)
	{
		
		if(fact <=1)
			return 1;
		
		return  (fact * factorial(fact-1));
		
		
	}

}
