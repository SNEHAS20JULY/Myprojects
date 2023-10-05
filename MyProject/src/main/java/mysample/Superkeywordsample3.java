package mysample;

public class Superkeywordsample3 extends Superkeywordsample2 {
	public void eat()
	{
		System.out.print("hello"+" ");
	}
	public void detail()
	{
		System.out.print(" "+"hello");
		eat();
		super.eat();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superkeywordsample3 obj=new Superkeywordsample3();
		obj.detail();
	}

}
