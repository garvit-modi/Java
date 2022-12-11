/**
 * 
 */
package basic;

/**
 * @author garvitkhandelwal
 * @since 10-Dec-2022
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		FibonacciSeries(0 , 1 , 10);
	}
	
	public  static void FibonacciSeries(int x , int y, int value) 
	{
		System.out.println("value -->> " + value);
		
		if(value ==0)
			return ;
			
		
		System.out.println(x);
		
		FibonacciSeries(y, x+y, --value);


		
	}

}
