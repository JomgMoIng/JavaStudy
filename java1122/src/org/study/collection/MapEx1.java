package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("가수1", "이모모");	// 키값은 중복 불가능
		map1.put("가수1", "강모모");	// 중복값은 뒤에서 덮음
		map1.put("가수2", "나모모");
		map1.put("가수3", "박모모");
		map1.put("가수4", "이모모");	// 밸류값은 중복  가능
		map1.put("가수5", "지모모");
		
		System.out.println(map1);
		System.out.println(map1.get("가수1"));
		
		//1. keySet() > key를 set	(key는 중복되지 않는다)
		Set<String> set = map1.keySet();	//키 값을 저장
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String val = map1.get(key);	//	key값 이용해서 value를 
			System.out.println("키 : "+key+", 값 : "+val);
		}
		
		
	}
	
	
	
	
}
