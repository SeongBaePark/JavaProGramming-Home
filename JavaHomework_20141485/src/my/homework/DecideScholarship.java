package my.homework;

import java.util.*;

public class DecideScholarship {

	public static void main(String[] args) {
		double gpa;
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		gpa = input.nextDouble();
		
		if (gpa >= 4.3)
		{
			System.out.println("���� ���б��̴�.");
		}
		else if (gpa >= 4.0)
		{
			System.out.println("�ݾ� ���б��̴�.");
		}

		else if (gpa >= 3.7)
		{
			System.out.println("��� ���б��̴�");
		}
		else
		{
			System.out.println("���б��� ���� �� ����.");
		}
	}
}
