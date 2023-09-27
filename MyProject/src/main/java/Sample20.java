
public class Sample20 {

	int a;
	int b;
	public Sample20(int a,int b)//constructor
	{
		
		this.a=a;
		this.b=b;
		
		
	}
	public void show()//method
	{
		System.out.println(a+" "+b);
	}
	
	
	public static void main(String[] args) {  //main method
		// TODO Auto-generated method stub
Sample20 obj=new Sample20(2,3);
obj.show();
	}

}
