package springDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	// add an init method 
	public void doMyStartupStuff() 
	{
		System.out.println("doing the init stuff");
	}
	// add a destroy method 
	public void doMyCleanupStuff()
	{
		System.out.println("doing my clean up ");
	}

}










