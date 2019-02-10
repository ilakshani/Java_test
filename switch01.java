import java.util.Scanner;

class Myclass{
public static void main(String[] args){
int day;
System.out.println("Enter a number(1-7):");
Scanner d = new Scanner(System.in);
day = d.nextInt();

switch(day) {
	case 1:
	case 2: {
		System.out.println("GHJKKJJHG");
	}
	break;
	case 6: {
		System.out.println("Saturday");
	}
	break;
	case 7: {
		System.out.println("Sunday");
	}
	break;
	
	default: {
		System.out.println("Week days");
	}
}
}
}