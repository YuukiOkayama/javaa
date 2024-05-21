package javaa.YuukiOkayama.com.github.train_01;

public class Train01Class09 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int delta = hiku(a, b);
		int total = tasu(a, b);
		System.out.println(a + " + " + b + " = " + total + ", " + a + " - " + b + " = " + delta);
	}
	
	public static int tasu(int a, int b) {
		return (a + b);
	}
	
	public static int hiku(int a, int b) {
		return (a - b);
	}
}
