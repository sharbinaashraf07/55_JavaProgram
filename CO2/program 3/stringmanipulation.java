import java.util.Scanner;

public class stringmanipulation{
public static void main(String[] args){

Scanner s=new Scanner(System.in);
System.out.println("enter a string");
String str=s.nextLine();
System.out.println("enter another string");
String stri=s.nextLine();
String com=str+stri;
System.out.println("combination of two strings are:"+com);
}
}