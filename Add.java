import java.util.Scanner;
class Add
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1=s.nextInt();
		System.out.println("Enter the number 2");
		int num2=s.nextInt();
		int sum=0;
		sum=num1+num2;
		System.out.println("the sum of two numbers is" +sum);
	}
}