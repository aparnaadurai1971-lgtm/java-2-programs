import java.util.Scanner:
public class oddeven
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int num=sc.nextint();
if(num%2==0){
System.out.println("Even Number");
else{
System.out.println("Odd Number:");
}
}
