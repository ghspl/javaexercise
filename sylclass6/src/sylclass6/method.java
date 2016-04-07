package sylclass6;

public class method {
	public static void main(String[] args){
	//1方法的定义与语法规则
		/*method a = new method();
		int rSum;
		rSum = a.calcSum(78,99);
		System.out.println("总分："+rSum);
	}
	public int calcSum(int a, int b){
		int sum = a+b;
		return sum;
	}*/
		
		
	//2参数与参数列表
		/*method a = new method();
		double rAve;
		int sub1 = 78;
		int sub2 = 99;
		rAve = a.calcAve(sub1,sub2);
		System.out.println("总分："+rAve);
	}
	public double calcAve(int a,int b){
		double ave =(a+b)/2;
		return ave;
	}*/
		
		//作业
		method a = new method();
		int Last;
		Last = a.calcLast(5);
		System.out.println("返回值"+Last);
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
