class Myclass{
	public static void main(String[] args){
		Vehicle.horn();
	}//horn method can be called without creating any object by using static variables.
}
		
		
class Vehicle{
			static void horn(){
				System.out.println("Beep   Beep");
			}
		}