package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] member = new Member[2];

		//TODO ここから実装する

		member[0] = new Member(1, "Pass0rd", "Miura Manabu", 28, 2);
		member[1] = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		MemberManager.showAllMembers(member);//staticだからオブジェクトがいらない

	}

}
