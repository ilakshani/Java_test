class Animal{
private int legs;
Animal(){
this.setlegs(4);
}
Animal(int m){
	this.setlegs(m);
}
public void setlegs(int m){
	this.legs = m;
}
public int getlegs(){
	return legs;
}

	
}

class Myclass{
	public static void main(String[] args){
		Animal a1= new Animal();
		Animal a2 = new Animal(2);
	
	System.out.println("First is "+a2.getlegs()+" and Second is "+a1.getlegs());
	}
}