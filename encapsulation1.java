package basic_java_prog;
import java.util.*;

public class encapsulation1 {
	int a=2;
	public int b=3;
	private int c=4;
	protected int d=5;
	
	public int add(int x,int y) {
		return x+y;
	}
	public int add(int x,int y,int a) {
		
		return x+y+a;
	}

	public static void main(String[] args) {
		Scanner at=new Scanner (System.in);
		encapsulation1 sc=new encapsulation1();
		System.out.println("i am default ="+sc.add(2,3));
	          System.out.println("i am default ="+sc.a);
	          System.out.println("i am public ="+sc.b);
	          System.out.println("i am private="+sc.c);
	          System.out.println("i am protected="+sc.d);
	          
	}

}
 