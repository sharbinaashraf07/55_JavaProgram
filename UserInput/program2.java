import java.util.Scanner;

public class arrayreverse{
public static void main(String[] args) {
int j=0;
int[] arr=new int[50];
int[] rev=new int[50];

Scanner sc=new Scanner(System.in);
System.out.println("enter the limit : ");
int size=sc.nextInt();

 System.out.println("enter elements :");
 for(int i=0;i<size;i++)
 arr[i]=sc.nextInt();

 for(int i=size-1;i>=0;i--)
  {
   rev[j]=arr[i];
    j++;
  }
 System.out.println("the reverse array :");
 for(int i=0;i<size;i++)
 System.out.print(rev[i]+"\n");
}
}