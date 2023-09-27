
public class Sample21 {
	int a;
	String b;
	public Sample21(int a, String b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void show()
	{
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample21 obj=new Sample21(5,"dhsj");
obj.show();
	}

}
