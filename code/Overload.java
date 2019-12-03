import java.util.*

public class Overload { 

	public int sum(int x, int y) 
	{ 
		return (x + y); 
	} 

	public int sum(int x, int y, int z) 
	{ 
		return (x + y + z); 
	} 

	public double sum(double x, double y) 
	{ 
		return (x + y); 
	} 

	public static void main(String args[]) 
	{ 
		Overload obj = new Overload(); 
		System.out.println(obj.sum(10, 20)); 
		System.out.println(obj.sum(10, 20, 30)); 
		System.out.println(obj.sum(10.5, 20.5)); 
	} 
} 
