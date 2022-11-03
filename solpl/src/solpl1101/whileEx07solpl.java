package solpl1101;

import java.util.Scanner;

public class whileEx07solpl {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("첫번째 숫자를 입력하세요");
			String q = input.next();
			if (q.equals("exit")) {
				break;
			} else {
				int a = input.nextInt();

				System.out.println("두번째 숫자를 입력하세요");
				String w = input.next();
				if (q.equals("exit")) {
					break;
				} else {
					int b = input.nextInt();

					System.out.println("연산자를 입력하세요");
					String str = input.next();
				
					if(str.equals("+")) {
						System.out.println(a+"+"+b+"="+(a+b));
					} else if(str.equals("-")) {
						System.out.println(a+"-"+b+"="+(a-b));
					} else if(str.equals("*")) {
						System.out.println(a+"*"+b+"="+(a*b));
					} else if(str.equals("/")) {
						System.out.println(a+"/"+b+"="+(a/(double)b));
					} else if(str.equals("exit")) {
					System.out.println("계산기 종료");
					break;
					}	else {
						System.out.println("입력오류! 다시입력");
					}
					
				}
			
					
				}

			}

		}

	}

