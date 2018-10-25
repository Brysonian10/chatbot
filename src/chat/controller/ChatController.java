package chat.controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import chat.model.Chatbot;

public class ChatController
{
	private Chatbot simpleBot;
	
	private String userJoke;
	private String userContent;
	private String userCurrent;
	private ArrayList<String> firstList = new ArrayList<String>();
	private ArrayList<String> firstSpooky = new ArrayList<String>();
	
	
	public ChatController()
	{
		simpleBot = new Chatbot(userJoke, userContent, userCurrent, firstList, firstSpooky);
	}
		
	public void start()
	{
		//method calls
		interactWithChatBot("");
		
		//exit loop
		String keepChatting =JOptionPane.showInputDialog(null, "Do you wat to continue chattiing?");
		if (keepChatting.equals("yes")) 
		{
			interactWithChatBot("");
		}else if (keepChatting.equals("no"))
		{
			String userInput = " ";
			while(!userInput.equalsIgnoreCase("quit")) 
			{
				userInput = JOptionPane.showInputDialog(null, "type 'quit' to exit ");
			}
			
		}
		
	}
	
	public void interactWithChatBot(String chatBotSays)
		{
			String currentUser = JOptionPane.showInputDialog(null, "Hi! What's your name?");
			simpleBot.setCurrentUser(currentUser);
			JOptionPane.showMessageDialog(null, simpleBot.processText(currentUser));
		}
		
	
	
	public void interactiveWithChatBot()
	{
		
	}
	
	public String useChatbotCheckers(String spooky)
	{
		
		return spooky;
			
	}
	
	
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
			
}
