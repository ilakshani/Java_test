import java.util.Scanner;
class myclass{
	public static void main(String[] args){
		System.out.println("Enter the mark:");
		int mark;
		Scanner mark1 = new Scanner(System.in);
		//System.out.println(mark1.nextInt());
		mark = mark1.nextInt();
		
		if(mark>100){
			System.out.println("invalid Input");
		}
		else if(mark>=75){
			System.out.println("Grade is A");
		}
		else if(mark>=65){
			System.out.println("Grade is B");
		}
		else if(mark>=55){
			System.out.println("Grade is C");
		}
		else if(mark>=40){
			System.out.println("Grade is S");
		}
		else if(mark<40){
			System.out.println("FAIL");
		}
		else if(mark<0){
			System.out.println("marks may not be negative");
		}
		else
		{
			System.out.println("wrong input");
		}
	}
}





/*int age;
	System.out.println("Enter the age:");
	Scanner a = new Scanner(System.in);
	age = a.nextInt();
	*/
		