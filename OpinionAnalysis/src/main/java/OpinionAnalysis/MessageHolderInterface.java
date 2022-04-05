package OpinionAnalysis;

public interface MessageHolderInterface {
	
	public void addMessage(Message message); 
	public String populateMessages();
	public Node getAllMessages();
	public int size();
	
}