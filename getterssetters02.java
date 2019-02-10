class Animal{
	private int legs;
	private String color;
	private String accomo;
	private int life_time;
	
	void sound(){
		System.out.println("Whoof-Whoof");
		System.out.println("I am a dog");
		
	}


public String getaccomo(){
	return accomo;
}
public void setaccomo(String a){
	this.accomo = a;
}
public String getcolor(){
	return color;
}
public void setcolor(String b){
	this.color = b;
}
public int getlife_time(){
	return life_time;
}
public void setlife_time(int c){
	this.life_time = c;
}
	public int getlegs(){
		return legs;
	}
	public void setlegs(int d){
		this.legs = d;
	}
}
class Myclass{
	public static void main(String[] args){
		
		Animal dog = new Animal();
		dog.setaccomo("DOMESTIC");
		dog.setcolor("brown");
		dog.setlife_time(10);
		dog.setlegs(4);
		
		System.out.println("Dog is a "+dog.getaccomo()+" animal");
		System.out.println("Our dog colour is "+dog.getcolor());
		System.out.println("A dog can live about "+dog.getlife_time()+" years.");
		System.out.println("A god has "+dog.getlegs()+" legs.");
		
		dog.sound();
		
		Animal cat = new Animal();
		cat.setaccomo("home");
		cat.setcolor("white");
		cat.setlife_time(3);
		cat.setlegs(4);
		
		
		System.out.println("cat is a "+cat.getaccomo()+" animal");
		System.out.println("Our cat colour is "+cat.getcolor());
		System.out.println("A cat can live about "+cat.getlife_time()+" years.");
		System.out.println("A cat has "+cat.getlegs()+" legs.");
		
		
		
		//cat.sound();
	}
}