/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ SnackTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 5.
 * </pre>
 * 
 * @author visitor
 * @version : 1.0
 */
public class SnackTest {

	public static void main(String[] args) {
		Snack[] snackArr = new Snack[3];
		snackArr[0]=new Snack("새우깡", "농심", 1100, 2);
		snackArr[1]=new Snack("콘칲", "크라운", 1200, 1);
	}

}
