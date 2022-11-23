package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {

		//1.
		Map<Integer, String> map1 = new HashMap<Integer, String>();
//		Map<Integer, String> map1 = new HashMap(); 
		
		//2.
		map1.put(new Integer(1), "user1");
		map1.put(2, "user2");	//자동 박싱
		map1.put(3, "user3");
		map1.put(4, "user4");
		map1.put(5, "user5");
		
		//3. key 저장 > Set > keySet()저장
		
		Set<Integer> keys = map1.keySet();
		
		//4.
		Iterator<Integer> map1run =keys.iterator();
		while(map1run.hasNext()) {
			Integer key = map1run.next();	//언박싱
//			int key = map1run.next();//자동언박싱 > key
			
			String val = map1.get(key); // > key에 해당하는 value
			
			System.out.println("key : "+key+", value : "+val);
		}
		
	}
}
