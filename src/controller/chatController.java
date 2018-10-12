package controller;
import model.chatModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class chatController
{
	public void start()
	{
		String answer = JOptionPane.showInputDialog(null, "Hello.");
		String userText = answer;
		while(!userText.equalsIgnoreCase("quit"))
		{
			userText = JOptionPane.showInputDialog(null, "Type 'quit' to exit.");
		}
		
		
	}
	
	private void simpleBot()
	{
		
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
