//StringTokenizerクラスを含むパッケージUtilを使用するためにインポートとして記述
//ただしimportを使わなくても全てのクラス利用箇所で1つずつjava.util.StringTokenizerを記述すれば利用できるがimportの方が便利
import java.util.StringTokenizer;

public class Add {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//StringTokenizer型の変数vに分割した文字列（トークン)を格納
		StringTokenizer v = new StringTokenizer("Apple,Melon,Lemon,Banana", ",");
		//変数の初期化を行い変数sにAppleを入れておく
		String s = v.nextToken();

		//Whileを使いループ処理。条件はhasMoreTokensにより全てのトークンを取得するまで繰り返す
		while(v.hasMoreTokens()) {
			//変数sに追記していく形ですべてのトークンを変数sに格納
			s = s + " + " + (v.nextToken());
		}
		//変数sの中身を標準出力
		System.out.println(s);
	}

}
