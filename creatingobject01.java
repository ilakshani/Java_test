class Animal{
	void bark(){
		System.out.println("woof-woof");
	}
	static void a(){
	System.out.println("Eating");
	}
	
	static void legs(int l){
		System.out.println("Has "+l+ " legs.");
	}
	
	static void eating(String name){
		System.out.println("like to eat "+name+ " hhh");
	}
}class Myclass{
	
	public static void main(String[] args){
		Animal dog = new Animal();
		Animal cow = new Animal();
		
		dog.bark();
		dog.a();
		dog.legs(4);
		cow.legs(3);
		dog.eating("meat");
		cow.eating("grass");
		
		
		/*now dog is an object of type Animal. Thus we can call its bark() method, using the name if the object and the dot. The dot notatin is 
		used to access the objects atributes and its methods. */
		
	}
}