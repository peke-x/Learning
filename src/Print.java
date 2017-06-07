
public class Print {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//整数型変数aに10を格納
		int a = 10;
		//実数型変数bに3.24を格納
		double b = 3.24;
		//空白を含む10桁で変数aを表示
		System.out.printf("%10d\n", a);
		//最大8桁の小数第5位まで変数bを表示
		System.out.printf("x %8.5f\n", b);
		//式用の出力内容
		System.out.printf("----------\n");
		//最大10桁でaとbの積を表示
		System.out.printf("%10f\n\n", a * b);
	}

}
