import java.util.Scanner;

public class BaseballStats {

	private int atBats;
	private int hits;
	private int doubles;
	private int triples;
	private int homeRuns;
	private int runs;
	private int walks;

	public BaseballStats(int atBats,int hits,int doubles, int triples, int homeRuns, int runs, int walks)
	{
		this.atBats=atBats;
		this.hits=hits;
		this.doubles=doubles;
		this.triples=triples;
		this.homeRuns=homeRuns;
		this.runs=runs;
		this.walks=walks;
	}
	
	public double battingAverage()
	{
		double average=0.0;
		average = (double)(hits)/atBats;
		return average;
	}
	
	public double onBasePercentage()
	{
		double percentage =0.0;
		percentage=(double)(hits+walks)/(atBats+walks+hits);
		return percentage;
	}
	
	public double sluggingPercentage()
	{
		double percentage = 0.0;
		percentage =(double)((hits-doubles-triples-homeRuns)+(2*doubles)+(3*triples)+(4*homeRuns))/atBats;
		return percentage;
	}
	
	public double onBasePlusSlugging()
	{
		double percentage =0.0;
		percentage = sluggingPercentage() + onBasePercentage();
		return percentage;
	}
	
	public int totalBases()
	{
		int total =0;
		total = (hits-doubles-triples-homeRuns)+(2*doubles+3*triples+4*homeRuns);
		return total;
	}
	
}
