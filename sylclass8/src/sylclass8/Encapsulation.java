package sylclass8;

public class Encapsulation {
	/*private double height;
	public double getHeight(){
	//getter ����������get�ؼ��ּ�������������������ĸ��д��
	//getter ����һ����Ϊ�˵õ�����ֵ
		return height;
	}
	//setter ����������set�ؼ��ּ�������������ĸ��д��
	//setter ����һ���Ǹ�����ֵ��ֵ��������һ������
	public void setHeight(double newHeight){
		height = newHeight;
	}
	public static void main(String[] args){
		Encapsulation LiLei = new Encapsulation();
		LiLei.setHeight(170.0);
		System.out.println("LiLei�������"+LiLei.getHeight());
	}*/
	
	/*private String name = "LiLei";
	public class Student{
		String ID = "20151234";
		public void stuInfo(){
			System.out.println("�����ⲿ���е�name:" + name);
			System.out.println("�����ڲ����е�ID:" + ID);
		}
	}
	public static void main(String[] args){
		Encapsulation a = new Encapsulation();
		Student b = a.new Student();
		b.stuInfo();
	}*/
	
	private String name = "LiLei";
	static String ID = "510***";
	public static class Student{
		String ID = "20151234";
		public void stuInfo(){
			System.out.println("�����ⲿ���е�ID��" + Encapsulation.ID);
			System.out.println("�����ڲ����е�ID��" +ID); 
		}
	}
		public static void main(String[] args){
			Student b = new Student();
			b.stuInfo();
		}
}


	

