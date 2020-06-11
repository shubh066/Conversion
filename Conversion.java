package DemoPrograms;
import java.util.*;
public class Conversion
{

public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of minutes");
	long mins = sc.nextLong();
	printYearsAndDays(mins);
}

public static void printYearsAndDays(long minutes)
{
	
	if (minutes < 0)
	{
	    System.out.println("Invalid Value");
	}
	else
{
	long years = minutes/525600; 
	System.out.println(years + " years");
	long days = minutes % 525600;   
	days = days / 1440;
	System.out.println(days + " days");
	System.out.println (minutes + " min" + " = " + years + " y" + " and " + days + " d");
   }
    
}
}
