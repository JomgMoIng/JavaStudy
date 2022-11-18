package org.study.innerclass;


public class SingletonEx {

	public static void main(String[] args) {
		
//		new Dao(); private라 안됨
		
		//싱글톤 > 객체를 한번만 생성
		Dao.getInstance();
		Dao dao = Dao.getInstance();
	
		dao.insert();
		dao.delete();
		dao.update();
		dao.select();
		
		
	}
}
