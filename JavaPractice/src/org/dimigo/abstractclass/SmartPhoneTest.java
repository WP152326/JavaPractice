/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 * 
 * @author visitor
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] phone = {
				new IPhone("iphone7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성",800000)
		};
		
		for(SmartPhone s:phone){
			System.out.println(s.toString());
			s.turnOn();
			s.pay();
			s.useSpecialFunction();
			s.turnOff();
			
		}
		
		
		
	}

}
