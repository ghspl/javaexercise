package sylclass8;

public class Encapsulation {
	/*private double height;
	public double getHeight(){
	//getter 方法命名是get关键字加属性名（属性名首字母大写）
	//getter 方法一般是为了得到属性值
		return height;
	}
	//setter 方法命名是set关键字加属性名（首字母大写）
	//setter 方法一般是给属性值赋值，所以有一个参数
	public void setHeight(double newHeight){
		height = newHeight;
	}
	public static void main(String[] args){
		Encapsulation LiLei = new Encapsulation();
		LiLei.setHeight(170.0);
		System.out.println("LiLei的身高是"+LiLei.getHeight());
	}*/
	
	/*private String name = "LiLei";
	public class Student{
		String ID = "20151234";
		public void stuInfo(){
			System.out.println("访问外部类中的name:" + name);
			System.out.println("访问内部类中的ID:" + ID);
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
			System.out.println("访问外部类中的ID：" + Encapsulation.ID);
			System.out.println("访问内部类中的ID：" +ID); 
		}
	}
		public static void main(String[] args){
			Student b = new Student();
			b.stuInfo();
		}
}


	

