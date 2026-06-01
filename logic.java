import java.util.Scanner;
class logic{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter age:");
int age = sc.nextInt();
System.out.println("Enter mark:");
int mark = sc.nextInt();
System.out.println((age>=20)&&(mark>=50));
}
}


