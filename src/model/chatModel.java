package model;
import java.util.ArrayList;


public class chatModel
{
	public String chatBot;
	private String currentUser;
	private String joke;
	private ArrayList <String> responseList;
	private ArrayList <String> spookyList;
	public String askName;
	public String content;
	
	
	public chatModel()
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
		
		spookyList.add("Do you like to eat worms?");
		spookyList.add("I like to talk to ghosts, do you like to talk to the supernatural?");
		
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
	
	
	public chatModel(ArrayList responseList, String currentUser, String joke, ArrayList spookyList, String chatBot, String askName)
	{
		this.responseList = responseList;
		this.currentUser = currentUser;
		this.joke = joke;
		this.spookyList = spookyList;
		this.chatBot = chatBot;
		this.askName = askName;
	}
	

}
