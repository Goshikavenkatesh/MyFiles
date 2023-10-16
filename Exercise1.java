package Lab;


public class Exercise1 {
	
	public int n;

	public Exercise1(int n) {
		
		this.n = n;
	}
	
	public void SumOfCubes() {
		
		int sum=0;
		
		while (n>0) {
		
		int i=n%10;
		
		sum=sum+(i*i*i);
		n=n/10;
		}
	System.out.println(sum);	
	}
	
	public static void main(String[] args)
	{
		Exercise1 e = new Exercise1(12345);
		e.SumOfCubes();
		
		
	}
	

}
