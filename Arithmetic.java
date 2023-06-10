
public class Arithmetic {
	public int add(int a, int b) {
		return a+b;
	}
	
	public boolean checkeven(int n) {
		if(n%2==0) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		int result = a.add(10,20);
		System.out.println(result);
		boolean res = a.checkeven(4);
		System.out.println(res);
	}

}
