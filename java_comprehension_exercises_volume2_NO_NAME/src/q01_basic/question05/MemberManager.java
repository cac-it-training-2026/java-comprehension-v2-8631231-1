package q01_basic.question05;

public class MemberManager {

	private MemberManager() {

	}

	public static void showAllMembers(Member[] members) {

		for (Member member : members) {
			member.showMember();
		}
	}

}
