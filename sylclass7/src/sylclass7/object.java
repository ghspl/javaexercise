package sylclass7;

public class object {
	double height;
	int age;
	boolean sex;
	
	void printBaseMes(){
		System.out.println("�ҵ������"+height+"cm");
		System.out.println("�ҵ�������"+age+"��");
		if(this.sex)
			System.out.println("��������");
		else
			System.out.println("����Ů��");
	}
	
	public static void main(String[] args){
		object LiLei = new object();
		LiLei.height = 170;
		LiLei.age = 20;
		LiLei.sex = true;
		
		LiLei.printBaseMes();
	}
}
