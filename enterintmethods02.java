import java.util.Scanner;

class Myclass{
	static int sum(int a,int b){
		return (a+b);
	}
	public static void main(String[] args){
		System.out.println("Enter first number:");
		int x ;
		Scanner a = new Scanner(System.in);
		x = a.nextInt();
		
		System.out.println("Enter second number:");
		int y ;
		Scanner b = new Scanner(System.in);
		y = b.nextInt();
		
		System.out.println(sum(x,y));
	}
}