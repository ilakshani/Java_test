class Vehicle{
private String color;
Vehicle(){  //constructor and constructor must have the same name as the its class
	color = "red";
	
}

public String setcolor(){
	return color;
}
}
class myclass{
	public static void main(String[] args){
		Vehicle v1 = new Vehicle();
		System.out.println("colour is " +v1.setcolor());
	}
}
	