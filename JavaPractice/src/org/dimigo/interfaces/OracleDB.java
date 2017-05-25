/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 		|_ OracleDB
 * 
 * 1. Overview : 
 * 2. Date : 2017. 5. 25.
 * </pre>
 * 
 * @author : visitor
 * @version : 1.0
 */
public class OracleDB implements IDBManager {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(ORACLE_DATABASE + " DB 저장");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println(ORACLE_DATABASE + " DB 조회");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(ORACLE_DATABASE + " DB 변경");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(ORACLE_DATABASE + " DB 삭제");
	}
	
}