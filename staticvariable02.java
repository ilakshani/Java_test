class Myclass{
public static void main(String[] args){
	counter u1 = new counter();
	counter u2 = new counter();
	counter u3 = new counter();
	counter jj = new counter();
	System.out.println(counter.COUNT);
}
}

class counter{
	static int COUNT = 10;
	counter(){
		COUNT++;
	}
}
