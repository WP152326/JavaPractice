/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |_ Operator
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * 
 * @author visitor
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=1700000, b=3,c=1500;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : %,d원\n",a);
		System.out.printf("점포 내 직원 수 : %,d명\n",b);
		System.out.printf("점포 수 : %,d개\n",c);
		System.out.printf("\n연간 인건비 : %,d원\n",(long)a*12*(long)b*(long)(c));
		
	}

}
