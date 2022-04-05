package OpinionAnalysis;

class Message implements MessageInterface{

	private String message;
	private int sentiment;

	public Message(String message){
		this.sentiment = 2;
		this.message = message;
	}
		
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setSentiment(int sentiment) {
		this.sentiment = sentiment;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public int getSentiment(){
		return this.sentiment;
	}
	
}