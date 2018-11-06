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
		String userInput = "";
		
		while (!userInput.equals("quit"))
			{
				userInput = interactWithChatbot(userInput);
			}

		
	}
	
	public String interactWithChatbot(String chatBotSays)
		{
			String currentUser = JOptionPane.showInputDialog(null, "Hi! What's your name?");
			simpleBot.setCurrentUser(currentUser);
			JOptionPane.showMessageDialog(null, simpleBot.processText(currentUser));
			
			return currentUser;
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
