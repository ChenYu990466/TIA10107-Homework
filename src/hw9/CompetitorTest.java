package hw9;

public class CompetitorTest {
	public static void main(String[] args) {
		Competitor moonCompetitor = new Competitor("饅頭人");
		Thread moonThread = new Thread(moonCompetitor);
		Competitor jamesCompetitor = new Competitor("詹姆士");
		Thread jamesThread = new Thread(jamesCompetitor);
		System.out.println("開始比賽!");
		moonThread.start();
		jamesThread.start();
		try {
			moonThread.join();
			jamesThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("比賽結束");
	}
}
