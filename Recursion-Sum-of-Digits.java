public class SumofDigits {
	public int sum(int n) {
		if(n==0) return 0;
		return n%10+sum(n/10);
	}
	public static void main(String[] args) {
		SumofDigits main=new SumofDigits();
		int res= main.sum(258512);
		System.out.println(res);
	}
}
