import java.util.*;
import java.lang.*;
class Format
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.next();
System.out.println("Enter the Integer value");
int x=sc.nextInt();
int y=str.length();
for(int i=0;i<y;i++)
{
System.out.print(str.charAt(i));
}
System.out.println("    0"+x);
}
}