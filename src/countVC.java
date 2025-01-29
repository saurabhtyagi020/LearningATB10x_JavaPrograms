public class countVC{

public static void main(String [] args)
{
	String str = "rajaram";
	int vCount=0;
	int consCount=0;
	
	for( int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		{
			vCount++;
		}
		else
	{
		consCount++;
	}

	}
		System.out.println(vCount);
		System.out.println(consCount);

}




}