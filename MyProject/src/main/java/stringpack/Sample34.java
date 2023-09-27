package stringpack;

public class Sample34 {
public void show(int a)
{
	System.out.print(a);
}

public void show(int a, int b) 
{
System.out.println(a+" "+b);
	
}

public void show(String a,String b) 
{
System.out.print(a+" "+b);	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample34 obj=new Sample34();
obj.show(5);
obj.show(3, 4);
obj.show("sneha","neha");
	}

}
