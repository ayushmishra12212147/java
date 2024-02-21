class Base{
public int x;
public int getx(){
return x;
}
public void setx(int x){
System.out.println("X is being set here");
this.x=x;
}
}
class Derived extends Base{
public int y;
public int gety(){
return y;
}
public void sety(int y){
System.out.println("y is being set here");

this.y=y;
}
}
class E{
public static void main(String args[]){
Base B=new Base();
B.setx(30);
System.out.println(B.getx());
Derived D=new Derived();
D.sety(40);
System.out.println(D.gety());
}
}
