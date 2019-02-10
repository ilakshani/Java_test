import java.util.Scanner;
class Myclass{
	public static void main(String[] args){
		System.out.println("Enter the nuber you like(1-100:");
		int no;
		Scanner n = new Scanner(System.in);
		//System.out.println(no.nextLine());
		no = n.nextInt();
		if((no%10==0)&&(no%3==0))
		{
			System.out.println("You are lucky");
		}
		else 
		{
			System.out.println("You are unlucky");
		}
	}
}
