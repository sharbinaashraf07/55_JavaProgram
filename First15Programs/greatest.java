public class greatest{
public static void main(String args[]){
int a=15;
int b=10;
int c=8;
if (a>b){
if(a>c)
System.out.println("greatest="+a);
else
System.out.println("greatest="+c);
}
else
{
if(b<c)
System.out.println("greatest="+b);
else
System.out.println("greatest="+c);
}
}
}