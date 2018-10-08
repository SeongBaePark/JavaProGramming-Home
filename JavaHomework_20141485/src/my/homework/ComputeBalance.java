package my.homework;

import java.util.*;

public class ComputeBalance {

	public static void main(String[] args) {
		int purchaseAmount;
		int balance = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("구매 금액을 입력해주세요 : ");
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
		System.out.println("구매 금액 : " + purchaseAmount);
		System.out.println("청구 금액 : " + balance);
	}
}
