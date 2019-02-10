class Myclass{
	public static void main(String[] args){
		
		
		Person j = new Person("john");// j is a reference type.
		j.setAge(20);// set age as 20
		celebrateBirthday(j);// call the method, called celebrateBirthday() of john. 
		System.out.println(j.getAge());//print the age as 21
	}
	
	static void celebrateBirthday(Person p){
		p.setAge(p.getAge()+1);//set age as (20+1)=21
	}
}

class Person{
	private String name;
	private int age;
	
	Person(String n){
		this.name = n;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int a){
		this.age = a;
	}
}
		