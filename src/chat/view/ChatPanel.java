package chat.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import chat.controller.ChatController;

public class ChatPanel
{
	private JTextField inputField;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;
	private SpringLayout appLayout;
	private ChatController appController;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	
	private void setupPanel()
	{
		
	}
	
	public ChatPanel(ChatController appController)
	{
		
	}
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				//Do Something...
			}
		});
	}
	
	
}
