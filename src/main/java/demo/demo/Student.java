package demo.demo;

public class Student {

	int id;
	String name; String email;
	float salary;
	AggregationTest address ;
	public Student(int id,String name,String email ,float salary, AggregationTest address){
		
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;	
		this.address=address;
		
	}  
		void display(){  
			System.out.println(id+" "+name+" "+email);  
			System.out.println(address.vill+" "+address.state+" "+address.ps);  
			
		}
		public static void main (String []args)
		{
			
			AggregationTest ad1= new AggregationTest("Amarshi","westbengal","Patashpur", "721454");
			AggregationTest ad2= new AggregationTest("Amarshi Kasba","westbengal","Patashpur", "721454");
			
			Student s1= new Student(12,"Rajesh","raju",5006f,ad1);
			s1.display();

			Student s2= new Student(12,"Rajesh","raju",5006f,ad1);
			s1.display();
		}

	}


