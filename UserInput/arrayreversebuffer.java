import java.io.*;

public class arrayreversebuffer{
public static void main(String[] args)throws IOException{
int i,limit;
BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the limit:");
limit=Integer.parseInt(read.readLine());
int[] item=new int[limit];
System.out.println("enter the array elements:");
for(i=0;i<limit;i++)
{
item[i]=Integer.parseInt(read.readLine());
}
System.out.println("array in reverse order is:");
for(i=limit-1;i>=0;i--)
{
System.out.println(item[i]);
}
}
}