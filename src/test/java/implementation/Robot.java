package implementation;

public class Robot{
	private String mood = null;
    private String outcome = null;
	
	
	public String getOutcome() {
		return outcome;
	}
	public Robot(String mood){
		System.out.println("Robot constructor " + mood);
		this.mood = mood;
		
	}
	public void setMood(String mood){
		this.mood = mood;
		
	}
	
	public String tickle(){
		switch (mood) {
		case "good":
		   outcome = "giggle";
		   break;
		 default:
			 outcome = "cry";
		}
		return outcome;
	}
	
	
}