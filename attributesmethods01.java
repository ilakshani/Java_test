class Vehicle{
	int wheels;
	double fuelcapacity;
	String name;
	int Maxspeed;
	
	
	void horn(){
	System.out.println("Beep!");
	}
}
class Myclass{
public static void main(String[] args){
	Vehicle bus = new Vehicle();
	bus.horn();
	bus.wheels = 6;
	bus.fuelcapacity = 1500.00;
	bus.name = "lanka";
	bus.Maxspeed = 100;
	
	
	
	System.out.println(bus.wheels);
	//System.out.prinntln(color);
	System.out.println(bus.fuelcapacity);
	System.out.println(bus.Maxspeed);
	bus.horn();
}
}
	