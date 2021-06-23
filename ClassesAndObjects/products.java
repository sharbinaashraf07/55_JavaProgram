class Product{
double pcode;
String pname;
double price;

String compare(Product p1, Product p2){
if(p1.price < p2.price &&p1.price < price){
return p1.pname;
}
if(p2.price < p1.price && p2.price < price){
return p2.pname;
}
else{
return pname;
}
}
}
public class products{
public static void main(String args[]){

Product p1 = new Product();
Product p2 = new Product();
Product p3 = new Product();

p1.pcode = (101);
p1.pname=( "redmi");
p1.price=(24000);

p2.pcode = (102);
p2.pname=( "samsung");
p2.price=(28000);

p3.pcode = (103);
p3.pname=( "iphone");
p3.price=(98000);

String lowest = p3.compare(p1, p2);
System.out.println("lowest price product is :" +lowest );
}
}