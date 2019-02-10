class Vehicle{
	private String color;
	Vehicle(){
		this.setcolor("red");
	}
	Vehicle(String a){
		this.setcolor(a);
	}
	public void setcolor(String a){
		this.color = a;
	}
	public String getcolor(){
		return color;
	}
	
}
class Myclass{
	public static void main(String[] args){
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Green");
	
	System.out.println("First is "+v1.getcolor()+" and Second is "+v2.getcolor());
	}
}