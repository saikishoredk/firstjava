import java.util.Scanner;
class max
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1=s.nextInt();
		System.out.println("Enter the number 2");
		int num2=s.nextInt();
	   System.out.println("Enter the number 3");
		int num3=s.nextInt();
		if(num1==num2 && num1==num3)
			System.out.println("the given numbers are same");
		else if(num1>num2)
			  if(num1>num3)
					System.out.println("the" +num1+ " is big");
		     else
			System.out.println("the"+num3+"is the biggest number");
	else if(num2>num3)
					System.out.println("the" +num2+ " is big");
		     else
			System.out.println("the"+num3+"is the biggest number");
	}
}