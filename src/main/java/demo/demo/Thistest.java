package demo.demo;

class Thistest{  
void m(){  
System.out.println(this);//prints same reference ID  
}  
public static void main(String args[]){  
Thistest obj=new Thistest();  
System.out.println(obj);//prints the reference ID  
 
}  
}  