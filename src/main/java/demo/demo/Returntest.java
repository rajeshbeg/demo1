package demo.demo;

 class A1 {
int id ; String name;
     A1(int id, String name){
	this.id=id;
    this.name=name;	

}
}
class B1 extends A1{
	float salary;
B1(int id, String name, float salary){
	//Reusing parent constructor
	super(id,name);
	this.salary=salary;
	
	
}
void display(){
	System.out.println(id +" "+name+" "+ salary);
}

}
class Returntest{
	public static void main (String args[]){
		B1 b = new B1(1,"name",3009f);
		b.display();
	}
}

