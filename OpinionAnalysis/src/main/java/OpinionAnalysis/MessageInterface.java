package OpinionAnalysis;

public interface MessageInterface {
	
	public void setMessage(String message);
	public void setSentiment(int sentiment);
	public String getMessage();
	public int getSentiment();

}