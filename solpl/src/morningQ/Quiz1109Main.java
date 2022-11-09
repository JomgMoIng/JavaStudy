package morningQ;

public class Quiz1109Main {

	//오버로딩
		public void m1() {};
		public int n1() {
			return 0;
		}
		public void m1(int num1) {};
		public void m1(int num1, int num2) {};
		public void m1(int num1 , String num2) {};
				
public static void main(String[] args) {
	//1
	Quiz1109 qui= new Quiz1109();
	
	qui.setUserName("sss");
	
	System.out.println(qui.getUserName());
	
	//2
	int[] arr1[] = new int[3][4];
	
	int num=1;
	for(int i=0;i<arr1.length;i++) { // 행
//		System.out.println(arr1[i]);
					//행 > 열갯수
		for(int j=0;j<arr1[i].length;j++) {
			arr1[i][j] = num++;
			System.out.print(arr1[i][j]+"\t"); // \t > tap
		}
		System.out.println();
	} 



}
	
}
