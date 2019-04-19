
public class Team {
	private int score;
	private Name name;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Name getName() {
		return name;
	}

	Fan fan;

	public Team(Name name) {
		this.name = name;
		this.score = 0;
		fan = new Fan(this.name);
	}

	public void hitGoal() {
		score = score + 1;
		fan.cheerUp();

	}
}
