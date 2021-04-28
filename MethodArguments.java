
public class MethodArguments
{
	static void nilaiFinal(String nama, int... nilai)
	{
		System.out.println(nama);
		int total = 0;
		for (int i : nilai) 
		{
			total += i;
		}
		System.out.println(total);


		
	
	}
	public static void main(String[] args)
	{
		nilaiFinal("yui masino", 90, 80, 90, 90);
		nilaiFinal("naruto", 100, 100, 100, 100);
	}
}