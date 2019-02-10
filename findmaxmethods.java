class Myclass{
	static int max(int x,int y){
		if(x>y){
			return x;
		}
		else if(y>x){
			return y;
		}
		else {
			return (x=y);
		}
	}
	
	static int min(int c,int d)
	{
		if(c>d){
			return d;
		}
		else if(d>c){
			return c;
		}
		else{
			return(c=d);
		}
	}
	public static void main(String[] args){
		System.out.println(max(47,105));
		System.out.println(min(48,63));
	}
}