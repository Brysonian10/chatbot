package chat.controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import chat.model.Chatbot;

public class ChatController
{
	private Chatbot simpleBot;
	
	private void simpleBot()
	{
		
	}
	
	public ChatController()
	{
		simpleBot = new Chatbot();
	}
		
	public void start()
	{
		String userInput = "";
		
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}	
		
	}
	
	public String interactWithChatbot(String text)
		{
			String userInput = JOptionPane.showInputDialog(null, "Hi! what do you want to talk about?");
			userInput = simpleBot.processText(userInput);
			return userInput;
		}
		
	
	
		
	
	
	public void getter()
	{
		
	}
	
	public void setter()
	{
		
		
	}
	
	public void interactiveWithChatBot()
	{
		
	}
	
	public boolean useChatbotCheckers(String spooky)
	{
		boolean halloween = true;
		
		return halloween;
		
		
	}
	
	public String useChatbotCheckers(String text)
	{
		String text = "";
		return text;
	}
	
	public boolean contentChecker (String text)
	{
		boolean content = true;
		
		return content;
	}
			
}
