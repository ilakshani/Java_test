import java.util.Scanner;
class Vehicle{
	private String color;
	private int wheels;
	private int seats;
	
	void sound(String m){
		System.out.println("Beep!"+m);
		System.out.println("luxury!");
	}
	public String getColor(){
		return color;
	}
	public void setColor(String c){
		this.color = c;
	}
	
public void setseat(int a){
	this.seats = a;
}
public int getseat(){
	return seats;
}
}
class Myclass {
	public static void main(String[] args){
		int no = 1;
		//Vehicle v =  new Vehicle();
		while(no>0){
			
		System.out.println("Enter your Vehicle name:");
		String vname;
		Scanner v1 = new Scanner(System.in);
		vname = v1.nextLine();
		
		
		System.out.println("Enter your Vehicle's owner NIC no:");
		String nic;
		Scanner v2 = new Scanner(System.in);
		nic = v2.nextLine();
		
		
		
		System.out.println("Enter your Vehicle REGISTRATION NUMBER:");
		String regnumber;
		Scanner v3 = new Scanner(System.in);
		regnumber = v3.nextLine();
		
		
		System.out.println("Enter owner's name:");
		String ownername;
		Scanner v4 = new Scanner(System.in);
		ownername = v4.nextLine();
		
		
		System.out.println("Enter your Vehicle color:");
		String color;
		Scanner v5 = new Scanner(System.in);
		color = v5.nextLine();
		
		
		
		
		//System.out.println("vname");
		/*v1.sound("car");
		v1.setColor("red");
		System.out.println(v1.getColor());
		v1.setseat(6);
		System.out.println(v1.getseat());
		System.out.println(" ");*/
		
		/*System.out.println("van");
		v1.sound("van");
		v1.setColor("white");
		System.out.println(v1.getColor());
		v1.setseat(16);
		System.out.println(v1.getseat());
		System.out.println(" ");
		
		System.out.println("bus");
		v2.sound("bus");
		v2.setColor("blue");
		System.out.println(v2.getColor());
		v2.setseat(54);
		System.out.println(v2.getseat());
		System.out.println(" ");*/
		
		}
		no++;
		
	}
	}
		