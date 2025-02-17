import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number:");
       int num =sc.nextInt(),count=0,sum=0,temp=num,power=0;
       for(;num>0;num/=10)
       {
          int rem=num%10;
          count++;
        }
       System.out.println(count);
       num=temp;
      for(;num>0;num/=10)
      {
         int rem=num%10;
         power=(int)Math.pow(rem,count);
         sum=sum+power;
      }
       System.out.println("sum:"+sum);

     System.out.println(temp==sum?"Armstrong":"not armstrong");
}
}