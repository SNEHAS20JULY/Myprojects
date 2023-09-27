package mysample;

public class Sample29 {
	String b;
	float c;
	public Sample29(String a, float e)//method
	{
		b=a;
		c=e;
	}
	
	public void show()//instance variable and static variable access(instance method)
	{
		System.out.println(b+" "+c);
	}

	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub
Sample29 obj=new Sample29("Sneha",67f);
obj.show();
	}

}
