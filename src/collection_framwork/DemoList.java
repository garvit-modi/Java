/**
 * 
 */
package collection_framwork;

import java.util.ArrayList;
import java.util.List;

/**
 * @author garvitkhandelwal
 * @since 11-Dec-2022
 */
public class DemoList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
List list = new ArrayList<String>();

list.add("1");

list.add(1, "kdjfakjsljsdf");

list.add(1, "123456");



list.set(1, "0987");

list.add("2");


//list.remove(String.valueOf(1));

System.out.println(list.toString());


	}

}
