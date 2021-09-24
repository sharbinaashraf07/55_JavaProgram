import java.util.Scanner;

public class search{
public static void main(String args[]){
int x,flag=0,i=0;

Scanner s=new Scanner(System.in);

int item[]=new int[5];
System.out.println("enter the numbers:");
for(int j=0;j<5;j++)
{
item[j]=s.nextInt();
}
System.out.println("enter the number to be searched");
x=s.nextInt();
for(i=0;i<5;i++)
{
if(item[i]==x)
{
flag=1;
break;
}
else
{
flag=0;
}
}
if(flag==1){
System.out.println("element found at the position:"+(i+1));
}
else
{
System.out.println("element not found");
}
}
}