package sylclass10;


public class CellPhone extends Telephone{
	 @Override
	 public void call(){
		 System.out.println("我可以打电话！");
	 }
	 @Override
	 public void message(){
		 System.out.println("我可以发短信！");
	 }
}
