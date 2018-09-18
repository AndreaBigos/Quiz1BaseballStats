import java.util.Scanner;

public class BaseballPlayerStats {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter your at bats stat: ");
		int atBats = s.nextInt();
		System.out.print("Enter your hits stat: ");
		int hits = s.nextInt();
		System.out.print("Enter your doubles stat: ");
		int doubles = s.nextInt();
		System.out.print("Enter your triples stat: ");
		int triples = s.nextInt();
		System.out.print("Enter your home runs stat: ");
		int homeruns = s.nextInt();
		System.out.print("Enter your runs stat: ");
		int runs = s.nextInt();
		System.out.print("Enter your walks stat: ");
		int walks =s.nextInt();

		BaseballStats stats = new BaseballStats(atBats, hits, doubles, triples,homeruns, runs, walks);
		System.out.println("Batting Average: " + stats.battingAverage());
		System.out.println("On Base Percentage: " + stats.onBasePercentage());
		System.out.println("Slugging Percentage: " + stats.sluggingPercentage());
		System.out.println("On Base + Slugging Percentage: " + stats.onBasePlusSlugging());
		System.out.println("Total Bases: " + stats.totalBases());








	}

}
