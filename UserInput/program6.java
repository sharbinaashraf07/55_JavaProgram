import java.util.Scanner;

public class smallest{
public static void main(String args[]){
int min, len, i;
int arr[] = new int[200];
Scanner sc = new Scanner(System.in);

System.out.print("Enter number of elements : ");
len = sc.nextInt();

System.out.print("Enter the limit: ");
 for(i=0; i<len; i++)
{
arr[i] = sc.nextInt();
}

min = arr[0];
for(i=0; i<len; i++)
{
if(min > arr[i])
{
min = arr[i];
}
}
System.out.print("smallest element : " + min);
}
}