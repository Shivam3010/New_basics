package basics;

public class Polymorphism_overloading {

	public void getdata(int trainnumber)
	{
		System.out.println("abc");
	}
	
	public void getdata(String from, String to)
	{
		System.out.println("def");
	}
	
	public void getdata(String trainname)
	{
		System.out.println("ghi");
	}
	
	public void getdata(long prn)
	{
		System.out.println("jkl");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism_overloading ob=new Polymorphism_overloading();
		ob.getdata(654132l);
	}

}
