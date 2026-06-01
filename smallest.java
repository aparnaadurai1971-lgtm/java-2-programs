import java.util.Arrays;
class smallest{
public static void main(String[]args)
{
int[] arr = {10,20,5,40,30};
Arrays.sort(arr);
System.out.println("Smallest number ="+ arr[arr.length-2]);
}
}
