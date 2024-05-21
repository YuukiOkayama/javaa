package javaa.YuukiOkayama.com.github.train_01;

public class Train01Class01 {
	public static void main(String[] args) {
		
		//クラスのオブジェクトを生成
		Train01Class02 cl = new Train01Class02();
		
		//メンバ変数を参照する
		String str1 = cl.name;
		
		//メソッドの呼び出し
		String str2 = cl.TestMethod();
		
		//結果を出力
		System.out.println(str1+str2);
	}
}
