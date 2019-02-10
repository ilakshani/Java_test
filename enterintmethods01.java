import java.util.Scanner;
class Myclass{
public static void main(String[] args){
	
	System.out.println("Enter no 1:");
	int a;
	Scanner n1 = new Scanner(System.in);
	a = n1.nextInt();
	
	System.out.println("Enter no 1:");
	int b;
	Scanner n2 = new Scanner(System.in);
	b = n2.nextInt();
	
	
mul(a,b);
}
static void mul(int x,int y){
	
	System.out.println(x*y);
}
}