package sylclass4;

//import java.util.Scanner;

public class control {
	
	public static void main(String[] args){
		//1.1控制语句……for	
		/*Scanner sc = new Scanner(System.in);
		System.out.println("输入成绩：");
		int score = sc.nextInt();
		if(score >= 60){
			if(score >=80){
				if(score >=90){
					System.out.println("成绩优秀");
				}
				else{
					System.out.println("成绩良好");
				}
			}
			else{
				System.out.println("成绩及格");
			}
		}
		else{
			System.out.println("需要补考");
		}
		sc.close();*/
		
		//1.2控制语句……switch
		/*int num = 2;
		switch( num ){
		case 1:
			System.out.println("恭喜你，获得了一等奖");
			break;
		case 2:
			System.out.println("恭喜你，获得了二等奖");
			break;
		case 3:
			System.out.println("恭喜你，获得了三等奖");
			break;
		default:
			System.out.println("很遗憾，下次再来");
		}*/
		
		/*2.1循环语句……while
		int i1 = 1, i2 = 1;
		int sum1 = 0,sum2 = 0;
		
		while (i1 <= 1000){
			if (0 == i1%2){
				sum1 += i1;
			}
			i1++;
		}
		System.out.println("用while，1到1000中，所有偶数的和为："+sum1);
		
		do{
			if (0 == i2%2){
				sum2 += i2;
			}
			i2++;
		}while(i2 <= 1000);
		System.out.println("用do…while，1到1000中，所有偶数的和为："+sum2);*/
		
		//2.2.1循环语句…for
		/*int sum = 0;
		for (int i = 1;i <= 100;i++){
			if (i % 3 !=0){
				sum = sum + i;
			}
		}
		System.out.println("1到100之间不能被3整除的数之和为：" + sum);*/
		
		//2.2.2for嵌套
		/*for(int i = 1;i<=4;i++){
			for (int j = 1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1;i<=5;i++){
			for(int j =1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		//3.1跳转语句
		/*for (int i = 1;i<=10;i++){
			if (0 == i % 3){
				break;
			}
			if (0 == i%5){
				System.out.println("我进来了！");
			}
		}*/
		
		/*for (int i = 1;i<=10;i++){
			if (0 == i%2)
				continue;
			System.out.println(i);
		}*/
		
		//4 作业
		/*int a = 4549;
		boolean result = true;
		for (int i = 2; i*i <= a; i++){
			if (0==i%a){
				result = false;
				break;
			}
		}
		if (result){
			System.out.println(a+"是素数");
		}
		else
			System.out.println(a+"不是素数");*/
	}
}
