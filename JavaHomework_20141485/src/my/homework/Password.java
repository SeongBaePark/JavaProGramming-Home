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
			System.out.println("��ȣ�� �Է��ϼ��� : ");
			input = sc.next();
			trynumber +=1;
			if (input.equals(password))
			{
				System.out.println("ȯ���մϴ�");
				break;
			}
			else
			{
				System.out.println("��ȣ�� Ʋ���ϴ�");
			}
			
			if (trynumber == 3)
			{
				System.out.println("������ �ź��մϴ�.");
				break;
			}
		}

	}

}
