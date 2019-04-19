
public class Fan {
	private Name favTeam;

	Fan(Name name) {
		this.favTeam = name;
	}

	public void cheerUp() {
		System.out.println("Team " + favTeam + "'s Fans Cheering !!!!");
	}
}
