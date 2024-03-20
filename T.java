class T{
int x;{
System.out.println("This is non static init block");
x=10;
}
static {
System.out.println("This is a static block");
}
{
System.out.println("This is a non static block");
}
static int y;{
System.out.println("this a static init block");
y=20;
}
public T(int a){
x=a;
System.out.println("This is a constrtuctor");
}
public static void main(String args[]){
T t1=new T(20);
}

}