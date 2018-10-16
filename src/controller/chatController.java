package controller;
import model.chatModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class chatController
{
	private chatModel simpleBot;
	
	private void simpleBot()
	{
		
	}
	
	public chatController()
	{
		simpleBot = new chatModel();
	}
		
	public void start()
	{
		String answer = JOptionPane.showInputDialog(null, "Hello.");
		String userText = answer;
		while(!userText.equalsIgnoreCase("quit"))
		{
			userText = JOptionPane.showInputDialog(null, "Type 'quit' to exit.");
		}
		
		
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
			
}
