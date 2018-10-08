package my.homework;

import java.util.*;

public class CalculateGrade {

	public static void main(String[] args) {
		Boolean cheating;
		char grade;
		int attendrate, totalscore;
		
		Scanner input = new Scanner(System.in);
		System.out.println("부정행위 여부를 입력하세요 : (true or false)");
		cheating = input.nextBoolean();
		if (cheating == true)
		{
			grade = 'F';
			System.out.println("학점 : " + grade);
		}
		else
		{
			System.out.println("출석률을 입력하세요 : ");
			attendrate = input.nextInt();
			if (attendrate < 80)
			{
				grade = 'F';
				System.out.println("학점 : " + grade);
			}
			else
			{
				
				System.out.println("총점을 입력하세요 : ");
				totalscore = input.nextInt();
				if (totalscore >= 90)
				{
					grade = 'A';
				}
				else if (totalscore >= 80)
				{
					grade = 'B';
				}
				else if (totalscore >= 70)
				{
					grade = 'C';
				}
				else if (totalscore >= 60)
				{
					grade = 'D';
				}
				else
				{
					grade = 'F';
				}
				System.out.println("학점 : " + grade);
			}
		}
	}

}
