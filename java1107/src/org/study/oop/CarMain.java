package org.study.oop;

public class CarMain {
public static void main(String[] args) {
	
	Car hCar = new Car();
	
	hCar.carName = "HCar";
	hCar.carYear = 2022;
	hCar.carCoin = 3000;
	hCar.carColor = "Red";
	hCar.carCC = 2000;	
	

	hCar.carInfo();
	System.out.println("===========");
	Car mCar = new Car();
	
	mCar.carName = "mCar";
	mCar.carYear = 2021;
	mCar.carCoin = 2000;
	mCar.carColor = "Blue";
	mCar.carCC = 1000;	
	

	mCar.carInfo();
	
// 두개 클래스의 주소끼리(class org.study.oop.Car)로 같아 true
	System.out.println(hCar.getClass()==mCar.getClass());
	
	

	
}
}
