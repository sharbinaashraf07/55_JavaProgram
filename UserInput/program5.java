import java.util.Scanner;

public class largestno{
public static void main(String[] args){
int n, lar;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the limit :");
n = sc.nextInt();
int a[] = new int[n];
System.out.println("Enter elements  :");
for(int i = 0; i < n; i++)
{
a[i] = sc.nextInt();
}
lar = a[0];
for(int i = 0; i < n; i++)
{
 if(lar < a[i])
{
lar = a[i];
}
}
System.out.println("largest element :"+lar);
}
}