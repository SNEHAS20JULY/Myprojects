package mysample;

public class Superkeyword extends Supersample{
	String color="white";
	
	public void show()
	{
		System.out.print(color +" "  );
		System.out.print(super.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Superkeyword obj=new Superkeyword();
obj.show();
	}

}
