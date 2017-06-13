/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *    |_ MelonGenreChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 * 
 * @author visitor
 * @version : 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		
		List<Music> balad = new ArrayList();
		List<Music> dance = new ArrayList();
		
		map.put("발라드", balad);
		map.put("댄스", dance);
		
		balad.add(new Music("팔레트","아이유"));
		
		dance.add(new Music("I LUV IT","PSY"));
		dance.add(new Music("맞지?","언니쓰"));
		
		System.out.println("--<< 멜론 장르별 챠트 >>--");
		printMap(map);
		
		dance.set(1, new Music("SIGNAL","트와이스"));
		System.out.println("--<< 댄스 2위 곡 변경 >>--");
		printMap(map);
		
		dance.remove(0);
		System.out.println("--<< 댄스 1위 곡 삭제 >>--");
		printMap(map);
		

	}
	
	public static void printMap(Map<String, List<Music>> map){
		for(String a : map.keySet()){
			
			System.out.println("[" + a + "]");
			for(Music m : map.get(a)){
				System.out.println("" + (map.get(a).indexOf(m)+1)+". " + m.toString());
			}
		}
	}

}
