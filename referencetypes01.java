class Myclass{
public static void main(String[] args){
	int nn = 15;
	function(nn);
	System.out.println(nn);//print the answer as 15.
	
	
	//System.out.println(function(45));
	
}

static int function(int nn){
	int ans = nn*5;
	return ans;
	//System.out.println(ans);//print the answer as 75.
}
}