package q02_advanced.question02;

import java.util.List;

public class MemberManager {

	private MemberManager() {
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {

		for (Member member : members) {

			if (member.getId() == targetId) {
				//member.getId()メンバーオブジェクトが持っているID
				member.setPassword(newPassword);
				return;
			}
		}

		System.out.println("該当者はいませんでした。");
	}

}
