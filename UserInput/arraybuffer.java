import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayelement
{
public static void main(String[] args){
int i,n;
BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("enter the limit of array:");
n=Integer.parseInt(reader.readLine());
int[] arr=new int[10];
System.out.println("enter the array element");
for(i=0;i<n;i++)
{
arr[i]=Integer.parseInt(reader.readLine());
}
System.out.println("array elements are:");
for(i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}
catch(Exception e)
{
}
}
}

