package mysample;

public class Sample31 {
	
	public void show()
	{
		System.out.println("hey");
	}
public void show(int a)
{
	//this.show();
	System.out.println(a);
	this.show();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample31 obj=new Sample31();
obj.show(4);
	}

}
