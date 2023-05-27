import java.util.Scanner;
class prime
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the range for to get the prime number");
        int end=s.nextInt();
        for(int j=2;j<end;j++){
            int num=j;
            int count=0;
            
        for(int i=2;i<=Math.sqrt(num);i++)
        {
           if(num%i==0)
            count++;
        }
        
        if(count==0)
            System.out.println(j+"is prime" );
        else
            System.out.println(j+"not prime");
        }
    }
}