package my.homework;

import java.util.*;

public class TaxiFare {

	public static void main(String[] args) {
		int fare;
		int income = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println( (i+1) + "번째 요금을 입력하세요 : ");
			fare = input.nextInt();
			income += fare;
		}
		System.out.println("총 수입 : " + income);
	}

}
