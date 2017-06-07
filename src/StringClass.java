
public class StringClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//文字列の長さを得る
		//String a = "ABC";
		//int l = a.length();
		//System.out.println(l);

		//文字列の一部を得る
		//String a = "ABCDEF";
		//String b = a.substring(2, 5);
		//System.out.println(b);

		//文字列比較から差異数を得る
		//String a = "ABCDE";
		//String b = "ABC";
		//int c = a.compareTo(b);
		//System.out.println(c);

		//文字列の判定
		//文字列本体
		String a = "Javaの勉強";
		//文字列全体数を取得
		int len = a.length();
		//文字列から後ろの2文字を取得
		String b = a.substring(len-2, len);
		//取得した2文字が勉強か否かを比較し変数cへ代入
		int c = b.compareTo("勉強");
		//文字列で結果出力
		System.out.println("「"+ a + "」の最後の2文字は「"+ b + "」");
		//cの値が0なら真の処理：cの値が0以外なら偽の処理
		System.out.println("勉強" +  (c == 0 ? "です" : "ではありません"));
	}
}
