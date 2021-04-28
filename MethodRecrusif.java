
public class MethodRecrusif
{
	static int methorecrusif(int value)
	{
		if (value == 1) {
			return 1;
		}
		return value * methorecrusif(value - 1);	
	}
	public static void main(String[] args)
	{
		System.out.println("10! 	= "+methorecrusif(10));
		System.out.println("5! 		= "+methorecrusif(5));
	}
}