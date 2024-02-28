import java.util.*;
abstract class Base{
abstract int Sq(int a);
abstract int rec(int a,int b);
abstract int tri(int a,int b);
abstract double circle(int a);
}
class Derived extends Base{
public int Sq(int a){
return a*a;
}
public int rec(int a,int b){
return a*b;
}
public int tri(int a,int b){
return a*b/2;
}
public double circle(int a){
return 3.14*a*a;
}
}
class Data{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of square followed by rectangle triangle circle");
int a=sc.nextInt();
int b=sc.nextInt();
Derived d=new Derived();
System.out.println(d.Sq(a));
System.out.println(d.rec(a,b));
System.out.println(d.tri(a,b));
System.out.println(d.circle(a));
}
}