package q01_basic.question06;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する
		try {
			// 9.1.1 会員ID入力
			System.out.print("input id>>");
			int inputid = cr.inputNumber();
			inputId = inputid;

		} catch (Exception e) {
			System.out.println("error!");
			e.printStackTrace();
		}

		try {

			System.out.print("input password>>");
			String inputpassword = cr.inputString();
			inputPassword = inputpassword;
		} catch (Exception e) {
			System.out.println("error!");
			e.printStackTrace();
		}

		//		 Member member = new Member();
		//		 member.Member();

		Member member = new Member(inputId, inputPassword, name, age, rank);

		// 9.3 ユーザー情報出力
		member.showMember();

	}

}
