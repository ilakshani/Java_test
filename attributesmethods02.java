class Vehicle{

	int wheels;
	double fuelcapacity;
	String color;
	int Maxspeed;
	
	static void sound(){
	System.out.println("peep peep");
}
}
class Myclass{
	public static void main(String[] args){
		Vehicle v1 = new Vehicle(); 
		Vehicle v2 = new Vehicle();
		v1.wheels = 4;
		v2.Maxspeed = 100;
		
		
		v2.color = "red";
		v1.sound();
		System.out.println(v2.color);
		System.out.println(v1.wheels);
		System.out.println(v1.Maxspeed);
		
		//01.sound();
	}
}
		