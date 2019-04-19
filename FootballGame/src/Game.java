import java.util.ArrayList;
import java.util.List;

public class Game {
	List<Team> teams;
	Reporter reporter;

	public Game() {
		teams = new ArrayList<>();
		reporter = new Reporter();
	}

	public void addTeam(Name name) {
		Team team = new Team(name);
		teams.add(team);
	}

	public void goal(Name teamName) {

		for (Team team : teams) {
			if (team.getName().equals(teamName)) {

				reporter.reports(teamName);
				team.hitGoal();
			}
		}
	}
}
