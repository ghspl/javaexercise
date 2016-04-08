package day0402;
import java.util.Scanner;
public class class2 
{
	public static void main(String[] args)
	{
		/*System.out.println("Define a variable a is ");
		int a;
		a = 1;
		System.out.println(a);
		
		double avg1=70.1;
		int rise = 10;
		double avg2 = avg1+rise;
		System.out.println("调整前平均分："+avg1);
		System.out.println("调整后平均分："+avg2);*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		int x = sc.nextInt();

		if(x <= 30) x+= 30;
		if(x > 30 && x<=60) {}
		if(x >60) x -=30;
		System.out.println("result ："+x);*/
		
		double score = 68.9;
		String str = (score >= 60) ? "及格" : "不及格";
		System.out.print("考试成绩："+str);
	}
}