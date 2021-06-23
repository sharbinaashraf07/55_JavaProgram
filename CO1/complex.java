class complex{
double real;
double image;

complex(double real,double image){
this.real=real;
this.image=image;
}
void addition(complex c1){
System.out.println("resulting complex number:"+(image+c1.image)+" i "+ "+" +(real+c1.real));
}
}
public class complexnumber{
public static void main(String[] args){

complex c1=new complex(1,4);
complex c2=new complex(2,5);

c2.addition(c1);
}
}