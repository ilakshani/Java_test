class Myclass{
	public static void main(String[]args){
		counter c1 = new counter();
		counter c2 = new counter();
		counter c3 = new counter();
		counter c4 = new counter();
		
		
		
		
		System.out.println(counter.count);
	}
}
class counter{
	static int count=0;//count variable is static and gets incremented by one each time a new object of the counter class is created.
	counter(){
		count++;
	}
}