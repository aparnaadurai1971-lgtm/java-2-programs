import java.util.Scanner;
class operators{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int a = sc.nextInt();
a+=5;
System.out.println("Add:"+a);
a-=5;
System.out.println("Subb:"+a);
a*=5;
System.out.println("multiply:"+a);
a/=5;
System.out.println("Division:"+a);
a%=5;
System.out.println("modulus:"+a);
}
}


