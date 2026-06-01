import java.util.Scanner;
class bitwise{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");
int a = sc.nextInt();
System.out.println("Enter second number:");
int b = sc.nextInt();
System.out.println("And:"+(a&b));
System.out.println("or:"+(a|b));
System.out.println("xor:"+(a^b));
}
}