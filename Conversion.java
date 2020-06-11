import java.util.*;
public class Conversion
{
	
public static void main(String[] args)
{
	

	Scanner sc = new Scanner(System.in);
	long mins = sc.nextInt();
	
	if(mins<0)
	{
		System.out.println("Invalid Value");
	}
	else
	{
		long days = mins /1440; // the remaining remainder needs to be divided by 24 * 60 = 1440.  
		System.out.println(days + " days");
		System.out.println (mins + " min" + " = " + " and " + days + " d");
    }
    
}
}
