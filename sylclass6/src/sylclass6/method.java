package sylclass6;

public class method {
	public static void main(String[] args){
	//1�����Ķ������﷨����
		/*method a = new method();
		int rSum;
		rSum = a.calcSum(78,99);
		System.out.println("�ܷ֣�"+rSum);
	}
	public int calcSum(int a, int b){
		int sum = a+b;
		return sum;
	}*/
		
		
	//2����������б�
		/*method a = new method();
		double rAve;
		int sub1 = 78;
		int sub2 = 99;
		rAve = a.calcAve(sub1,sub2);
		System.out.println("�ܷ֣�"+rAve);
	}
	public double calcAve(int a,int b){
		double ave =(a+b)/2;
		return ave;
	}*/
		
		//��ҵ
		method a = new method();
		int Last;
		Last = a.calcLast(5);
		System.out.println("����ֵ"+Last);
	}	
	public int calcLast(int n){
		int last=0;
		for(int i = 1;i <= n;i++){
			for(int j = 1;j <= i;j++){
				last++;
				System.out.printf("%02d",last);
			}
			System.out.println();
		}
		return last;
	}
}
