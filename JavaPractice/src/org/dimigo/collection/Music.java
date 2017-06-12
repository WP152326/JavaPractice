/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *    |_ Music
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 * 
 * @author visitor
 * @version : 1.0
 */
public class Music {
	
	private String title;
	private String singer;
	
	public Music(String title, String singer){
		this.title = title;
		this.singer = singer;
	}
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		
	}
	public String getSinger(){
		return this.singer;
	}
	public void setSinger(String singer){
		
	}
	public String toString(){
		return title+" ("+singer+")";
	}
}
