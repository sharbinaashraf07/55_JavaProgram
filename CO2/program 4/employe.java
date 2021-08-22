import java.util.Scanner;
public class employe{
double eNo;
String eName;
double eSalary;
int flag =0;

void get(){

Scanner s = new Scanner(System.in);
System.out.println("Enter employee Number: ");
eNo = Integer.parseInt(s.nextLine());
System.out.println("Enter employee Name: ");
eName = s.nextLine();
System.out.println("Enter employee Salary: ");
eSalary = Integer.parseInt(s.nextLine());
}

int i =0;

void search(double n){
for(i =0; i<3;i++){
if(eNo == n){
System.out.println("\n\t" + eNo + "\n\t" +eName +"\n\t" +eSalary+"\n\t");
break;
}
}
}

public static void main(String[ ] args){

employe emp[] = new employe[3];

for(int j =0;j <3;j++){
emp[j] = new employe();
}

for(int j =0;j <3;j++){
System.out.println("Enter details of employes :"+ (j +1));
emp[j].get();
}
double n;
Scanner s = new Scanner(System.in);
System.out.println("Enter employee Number to search :");
n = s.nextInt();
for(int j =0;j <3;j++){
emp[j].search(n);
}
}
}


