package q01_basic.question07;

public class SystemMain07 {

	public static void main(String[] args) {

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();
		//←入力した文字の判定

		try {
			limit = cr.inputNumber();
			//limitのなかに数値を代入して以下で判定する
		} catch (Exception e) {//↓型みたいなもの
			e.printStackTrace();
		}

		numberList.addFromOneTo(limit);
		System.out.println(numberList.getNumbers());
		//getnumbersはさっき入れたものnumbersをgetter

		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;
		//TODO ここから実装する
		sum = numberList.calcSumOfList();
		//calcはnumberlistで全部足したもの

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");

		//TODO ここから実装する
		numberList.doubleListEachValue();
		System.out.println(numberList.getNumbers());

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		//TODO ここから実装する

		numberList.removeIndexOfFirstHalf();
		System.out.println(numberList.getNumbers());

	}

}
