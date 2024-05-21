package javaa.YuukiOkayama.com.github.train_01;

public class Train01Class05 {
	public static void main(String[] args) {
		// seqのリストを定義する
		int[] seq = new int[10];
		
		// 塩基を定義する
		String[] base = {"A", "T", "G", "C"};
		
		// seqリストに0~4のランダムな数字を入れていく
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		// seqに入れられたランダムな数字に対応する塩基をbaseリストから取得する
		for (int i = 0; i < seq.length; i++) {
			System.out.print(base[seq[i]] + " ");
		}
	}
}
