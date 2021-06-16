import java.util.Scanner;

class arrayuser{
public static void main(String args[]){
int n;
System.out.println("enter the arrray elements:");
Scanner myObj=new Scanner(System.in);
n=myObj.nextInt();

int[] arr=new int[10];
System.out.println("enter the elements of the array");
for(int i=0;i<n;i++)
{
arr[i]=myObj.nextInt();
}
System.out.println("Array elements are:");
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}
}