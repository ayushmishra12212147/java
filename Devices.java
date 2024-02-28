import java.util.*;
abstract class phone{
abstract void phoneOn();
abstract void phoneOff();
}
class Redmi extends phone{
void phoneOn(){
System.out.println("Redmi phone is onn");
}
void phoneOff(){
System.out.println("Redmi phone is off");
}

}
class Samsung extends phone{
void phoneOn(){
System.out.println("Samsung phone is onn");
}
void phoneOff(){
System.out.println("Samsung phone is off");
}

}
class Vivo extends phone{
void phoneOn(){
System.out.println("Vivo phone is onn");
}
void phoneOff(){
System.out.println("Vivo phone is off");
}

}

class Devices{
public static void main(String args[]){
Redmi r=new Redmi();
Samsung s=new Samsung();
Vivo v=new Vivo();
r.phoneOn();
s.phoneOn();
v.phoneOn();
r.phoneOff();
s.phoneOff();
v.phoneOff();
}
}

