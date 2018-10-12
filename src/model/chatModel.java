package model;
import java.util.ArrayList;


public class chatModel
{
	public String chatBot;
	private String currentUser;
	private String joke;
	private String responseList;
	private String spookyList;
	public String askName;
	
	
	
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
	
	public String getResponseList()
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
	
	public String getSpookyList()
	{
		
		return spookyList;
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
	
	public void setResponseList(String responseList)
	{
		this.responseList = responseList;
	}
	
	public void setCurrentUser(String currentUser)
	{
		this.currentUser = currentUser;
	}
	
	public void setJoke(String joke)
	{
		this.joke = joke;
	}
	
	public void setSpookyList(String spookyList)
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
	
	public chatModel()
	{
		
	}
	
	public chatModel(String responseList, String currentUser, String joke, String spookyList, String chatBot, String askName)
	{
		this.responseList = responseList;
		this.currentUser = currentUser;
		this.joke = joke;
		this.spookyList = spookyList;
		this.chatBot = chatBot;
		this.askName = askName;
	}
	

}
