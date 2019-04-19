import java.awt.List;
import java.util.ArrayList;

public class Reporter {
	ArrayList<Name> teams = new ArrayList<>();

	public void reports(Name team) {
		System.out.println("Team " + team + " hits the goal");
	}
}
