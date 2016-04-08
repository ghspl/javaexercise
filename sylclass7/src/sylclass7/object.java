package sylclass7;

public class object {
	double height;
	int age;
	boolean sex;
	
	void printBaseMes(){
		System.out.println("我的身高是"+height+"cm");
		System.out.println("我的年龄是"+age+"岁");
		if(this.sex)
			System.out.println("我是男生");
		else
			System.out.println("我是女生");
	}
	
	public static void main(String[] args){
		object LiLei = new object();
		LiLei.height = 170;
		LiLei.age = 20;
		LiLei.sex = true;
		
		LiLei.printBaseMes();
	}
}
