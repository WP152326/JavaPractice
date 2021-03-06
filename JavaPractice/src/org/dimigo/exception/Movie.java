/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *    |_ Movie
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 * 
 * @author visitor
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle(){
		return title;
	}
	public int getLimitAge(){
		return limitAge;
	}
	public void buyTicket(int age) throws Exception{
		
		if(age<this.limitAge){
			throw new Exception(this.title+"은/는"+this.limitAge+"세 이상 관람가입니다.");
		}
		else{
			System.out.println(this.title+"즐감하세요.");
		}
	}
	
}
