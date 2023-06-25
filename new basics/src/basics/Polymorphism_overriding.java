package basics;


class BJP extends Polymorphism_overriding
{
	public int getdata(int input)
	{
		
		int Gst=(input*5)/100;
		return Gst;
	}
	
}
public class Polymorphism_overriding
{
	
	public int getdata(int input)
	{
		
		int Gst=(input*18)/100;
		return Gst;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism_overriding ob=new Polymorphism_overriding();
		int out=ob.getdata(1000);
		System.out.println(out);
	}

}
