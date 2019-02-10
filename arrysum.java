
class Myclass{
public static void main(String[] args){
//int IRE[] = {0,1,2,3,4,5,6,7,8,9};
int a[] = {4,8,9,5,1,3,7,5};

int sum = 0,x;
for(x=0;x<a.length;x++)
{
	//sum+=IRE[x];
	sum = sum + a[x];
}
System.out.println("The total sum is "+sum);
}
}
	