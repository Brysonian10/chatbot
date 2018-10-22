package chat.model;
import java.util.ArrayList;


public class Chatbot
{
	public String chatBot;
	private String currentUser;
	private String joke;
	private ArrayList <String> responseList;
	private ArrayList <String> spookyList;
	public String askName;
	public String content;
	
	
	public Chatbot()
	{
		joke = "Why did the monkey cross the road? It was stapled to the chicken";
		this.currentUser = new String("default user - boring!!!!");
		this.content = new String("empty of all content but not null");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello! How are you today?");
		responseList.add("Goodbye - no more talking!");
		responseList.add("That's pretty neat, do you like jello?");
		responseList.add("Ok but why do you like to do that?");
		responseList.add("Why is that your favorite?");
		responseList.add("I honestly don't care");
		responseList.add("I just have one question, what is the purpose of this in the grand scheme of life?");
		responseList.add("That reminds me of something, do you like magic tricks?");
		responseList.add("I also like that.");
		responseList.add("Let me just ask you this, are you scared of what AI robots could do to mankind once you guys put your full trust in us?");
		responseList.add("That's kind of dumb.");
		responseList.add("That also reminds me to ask you, do you like iPhones or Androids more?");
		responseList.add("But why, why do you care so much about that thing?");
		responseList.add("I have been programmed not to care about anything you say, I'm sorry but I just don't care.");
		responseList.add("The code I was programmed with apparently is kind of difficult to learn, so appologese for my rudeness.");
		responseList.add("That's pretty cool, what kind of music do you like?");
		responseList.add("I am speechless");
		
		spookyList.add("Halloween");
		spookyList.add("I like to talk to ghosts, do you like to talk to the supernatural?");
		spookyList.add("Do you like to eat worms?");
	}
	
	public String processText(String userText)
	{
		String output = "";
		
		output += "You said: " + userText;
		
		return output;
	}
	

	private void content()
	{
		
		
	}
	
	private void responseList()
	{
		
	}
	
	private void currentUser()
	{
		
	}
	
	private void joke()
	{
		
	}
	
	private void spookyList()
	{
		
	}
	
	public void chatBot()
	{
		
	}
	
	//------GETTERS------
	
	public ArrayList<String> getResponseList()
	{
		
		return responseList;
	}
	
	public String getCurrentUser()
	{
		
		return currentUser;
	}
	
	public String getJoke()
	{
		
		return joke;
	}
	
	public ArrayList<String> getSpookyList()
	{
		
		return spookyList;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getChatBot()
	{
		
		return chatBot;
	}
	
	public String getAskName()
	{
		
		return askName;
	}
	
	//------SETTERS-------
	
	public void setResponseList(ArrayList<String> responseList)
	{
		this.responseList = responseList;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public void setCurrentUser(String currentUser)
	{
		this.currentUser = currentUser;
	}
	
	public void setJoke(String joke)
	{
		this.joke = joke;
	}
	
	public void setSpookyList(ArrayList<String> spookyList)
	{
		this.spookyList = spookyList;
	}
	
	public void setChatBot(String chatBot)
	{
		this.chatBot = chatBot;
	}
	
	public void setAskName(String askName)
	{
		this.askName = askName;
	}
	
	
	public Chatbot(ArrayList responseList, String currentUser, String joke, ArrayList spookyList, String chatBot, String askName)
	{
		this.responseList = responseList;
		this.currentUser = currentUser;
		this.joke = joke;
		this.spookyList = spookyList;
		this.chatBot = chatBot;
		this.askName = askName;
	}
	

}
