package sylclass5;

public class array {
	public static void main(String[] args){
		/*int [] ages = {12, 18, 9, 33, 45, 60};
		for (int i = 0; i< ages.length; i++){
			System.out.println("�����е�"+(i+1)+"��Ԫ����"+ages[i]);
		}*/
		
		int [] ages = {12, 18, 9, 33, 45, 60};
		int i = 1;
		for (int age:ages){
			System.out.println("�����е�"+i+"��Ԫ����"+age);
            i++;
		}
	}
}
