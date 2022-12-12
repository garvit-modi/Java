/**
 * 
 */
package basic;

import java.util.Scanner;

/**
 * How to print summation of n numbers?
 * @author garvitkhandelwal
 * @since 11-Dec-2022
 */
public class SumOfNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		int output = ((number +1)* number)/2;
		System.out.println("output->" + output);
		
	}

}
