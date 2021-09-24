import java.util.Scanner;
import java.util.Arrays;

public class sort{
public static void main(String args[]){

System.out.println("enter the strings:");
String items[]=new String[5];
Scanner s=new Scanner(System.in);

for(int i=0;i<5;i++)
{
items[i]=s.nextLine();
}
System.out.println("after sorting:");
Arrays.sort(items);
System.out.println(Arrays.toString(items));
}
}