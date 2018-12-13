package chat.controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import chat.model.Chatbot;
import chat.view.ChatFrame;
import chat.view.ChatPanel;

public class ChatController
{
	private Chatbot simpleBot;
	
	private String userJoke;
	private String userContent;
	private String userCurrent;
	private ArrayList<String> firstList = new ArrayList<String>();
	private ArrayList<String> firstSpooky = new ArrayList<String>();
	private ChatPanel appPanel;
	private ChatFrame appFrame;
	
	
	public ChatController()
	{
		simpleBot = new Chatbot(userJoke, userContent, userCurrent, firstList, firstSpooky);
		appFrame = new ChatFrame(this);

	}
		
	public void start()
	{
	
		
		
	}
	
	public String interactWithChatbot(String userText)
		{
			String output = "";
			output += simpleBot.processText(userText);
			return output;
		}
		
	
	
	public void interactiveWithChatBot()
	{
		
	}
	
	public String useChatbotCheckers(String text)
	{
		String testedValues = "The following checkers passed: ";
		if(simpleBot.contentChecker(text))
		{
			testedValues += "\nContent Checker";
		}
		if (simpleBot.spookyChecker(text))
		{
			testedValues += "\nSpooky Checker";
		}
		if (simpleBot.validityChecker(text))
		{
			testedValues += "\nValidity Checker";
		}
		return testedValues;
			
	}
	
	
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame,  error.getMessage());
	}
	
	private void close()
	{
		System.exit(0);
	}
	
	
			
}
