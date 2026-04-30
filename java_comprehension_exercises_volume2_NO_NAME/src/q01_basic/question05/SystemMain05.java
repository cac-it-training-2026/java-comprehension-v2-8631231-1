package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];

		members[0] = new NonMember("Sato Kensuke");

		members[1] = new Member(1, "Pass0rd", "Miura Manabu", 28, 2);

		for (AbstMember m : members) {
			m.showMember();
		}
		for (AbstMember m : members) {
			m.buyItem();
		}
	}
}
