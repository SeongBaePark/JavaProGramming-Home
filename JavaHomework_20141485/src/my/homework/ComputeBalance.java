package my.homework;

import java.util.*;

public class ComputeBalance {

	public static void main(String[] args) {
		int purchaseAmount;
		int balance = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �ݾ��� �Է����ּ��� : ");
		purchaseAmount = input.nextInt();
		if (purchaseAmount >= 30000)
		{
			balance = purchaseAmount - 30000;
		}
		else if ((purchaseAmount < 30000) & (purchaseAmount >= 10000))
		{
			balance = purchaseAmount - 5000;
		}
		else if (purchaseAmount < 10000)
		{
			balance = purchaseAmount;
		}
		System.out.println("���� �ݾ� : " + purchaseAmount);
		System.out.println("û�� �ݾ� : " + balance);
	}
}
