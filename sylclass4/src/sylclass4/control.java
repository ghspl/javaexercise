package sylclass4;

//import java.util.Scanner;

public class control {
	
	public static void main(String[] args){
		//1.1������䡭��for	
		/*Scanner sc = new Scanner(System.in);
		System.out.println("����ɼ���");
		int score = sc.nextInt();
		if(score >= 60){
			if(score >=80){
				if(score >=90){
					System.out.println("�ɼ�����");
				}
				else{
					System.out.println("�ɼ�����");
				}
			}
			else{
				System.out.println("�ɼ�����");
			}
		}
		else{
			System.out.println("��Ҫ����");
		}
		sc.close();*/
		
		//1.2������䡭��switch
		/*int num = 2;
		switch( num ){
		case 1:
			System.out.println("��ϲ�㣬�����һ�Ƚ�");
			break;
		case 2:
			System.out.println("��ϲ�㣬����˶��Ƚ�");
			break;
		case 3:
			System.out.println("��ϲ�㣬��������Ƚ�");
			break;
		default:
			System.out.println("���ź����´�����");
		}*/
		
		/*2.1ѭ����䡭��while
		int i1 = 1, i2 = 1;
		int sum1 = 0,sum2 = 0;
		
		while (i1 <= 1000){
			if (0 == i1%2){
				sum1 += i1;
			}
			i1++;
		}
		System.out.println("��while��1��1000�У�����ż���ĺ�Ϊ��"+sum1);
		
		do{
			if (0 == i2%2){
				sum2 += i2;
			}
			i2++;
		}while(i2 <= 1000);
		System.out.println("��do��while��1��1000�У�����ż���ĺ�Ϊ��"+sum2);*/
		
		//2.2.1ѭ����䡭for
		/*int sum = 0;
		for (int i = 1;i <= 100;i++){
			if (i % 3 !=0){
				sum = sum + i;
			}
		}
		System.out.println("1��100֮�䲻�ܱ�3��������֮��Ϊ��" + sum);*/
		
		//2.2.2forǶ��
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
		
		//3.1��ת���
		/*for (int i = 1;i<=10;i++){
			if (0 == i % 3){
				break;
			}
			if (0 == i%5){
				System.out.println("�ҽ����ˣ�");
			}
		}*/
		
		/*for (int i = 1;i<=10;i++){
			if (0 == i%2)
				continue;
			System.out.println(i);
		}*/
		
		//4 ��ҵ
		/*int a = 4549;
		boolean result = true;
		for (int i = 2; i*i <= a; i++){
			if (0==i%a){
				result = false;
				break;
			}
		}
		if (result){
			System.out.println(a+"������");
		}
		else
			System.out.println(a+"��������");*/
	}
}
