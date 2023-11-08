package interfaceproject;
interface Printable{ 
	int price=10;
void print();  
void usePaper();
}
interface Showable extends Printable{  
	String show="paper";
void show(); 
void color();

}  

public class TestInterface implements Printable,Showable {
	//int price=11;
	public void print(){
		System.out.println("Hello");
		}  
	public void usePaper(){
		System.out.println("Display content in A4 Sheet");
	}
	public void show(){
		System.out.println("Welcome");
	}
	public void color() {
		System.out.println("Display content in black color");
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface obj = new TestInterface();  
		obj.print();  
		obj.usePaper();
		obj.show();  
		obj.color();
		System.out.println(obj.price);
		System.out.println(obj.show);
		
		 }  
	}
