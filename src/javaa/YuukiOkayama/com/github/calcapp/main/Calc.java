package javaa.YuukiOkayama.com.github.calcapp.main;
import javaa.YuukiOkayama.com.github.calcapp.logics.Calclogic;

public class Calc {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = Calclogic.tasu(a, b);
		int delta = Calclogic.hiku(a,  b);
		System.out.println(a + " + " + b + " = " + total + ", " + a + " - " + b + " = " + delta);
	}

}
