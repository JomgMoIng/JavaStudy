package solpl1101;

public class ArrayeEx07so {
	public static void main(String[] args) {
		System.out.println("배열");

		System.out.println("char형 >> String");
		
		int i;
		char ch[] = {'C','A','F','E'}; //아스키코드로 인트로 변환하여 변수 binnery에 맞는 주소찾기
		String binnery[] = {
				"0000", "0001", "0010", "0011", 
				"0100", "0101", "0110", "0111", 
				"1000", "1001", "1010", "1011", 
				"1100", "1101", "1110", "1111", 
		};
		String result = "";
		
		for(i=0;i < ch.length;i++) { 
			if(ch[i]>='0' && ch[i] <='9') { // ch[i]는 false라 바로 else로 이동
				result += binnery[ch[i]-'0'];
			} else {
				result += binnery[ch[i]-'A'+10]; // +=는 자기자신에 증감반복임
			}	//ch[i](C는67)의 값에서 아스키코드 기준A(65)의 값을(67-65+10) 뺀 10번째부터의 주소가
			//binnery[]에서 찾을수있음
		}
		System.out.println("ch="+ new String(ch));
		System.out.println("ch="+ String.copyValueOf(ch));
		System.out.println(result);

		
		
	}
}
