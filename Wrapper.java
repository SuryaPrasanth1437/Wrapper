package oops;

public class Wrapper
{

	public static void main(String[] args)
	{

		int a=20;
		Integer i=Integer.valueOf(a);
		Integer j=a;
		System.out.println(a+" "+i+" "+j);
		
		System.out.println("******************");
		
		Integer b=new Integer(3);
		int c=b.intValue();
		int s=b;
		System.out.println(b+" "+c+" "+s);
		
		
	}

}
