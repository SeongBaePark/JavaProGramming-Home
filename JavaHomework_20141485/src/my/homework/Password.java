package my.homework;

import java.util.*;

public class Password {

	public static void main(String[] args) {
		String password = "myongji60";
		String input;
		int trynumber = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("암호를 입력하세요 : ");
			input = sc.next();
			trynumber +=1;
			if (input.equals(password))
			{
				System.out.println("환영합니다");
				break;
			}
			else
			{
				System.out.println("암호가 틀립니다");
			}
			
			if (trynumber == 3)
			{
				System.out.println("접속을 거부합니다.");
				break;
			}
		}

	}

}
