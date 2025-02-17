class Strpalindrome
{
public static void main (String[] args)
{
String s="a1b2c1",s2="";int rev=0;
for(int x=0;x<s.length();x++)
{
char c=s.charAt(x);
if(c>='0'&&c<='9')
    s2=s2+c;
}
System.out.println(s2);
int n=Integer.parseInt(s2),temp=n;
for(;n>0;n/=10)
{
int rem=n%10;
 rev=rev*10+rem;
}
if(temp==rev)
     System.out.println("palindrome");
else
     System.out.println("not palindrome");

}
}