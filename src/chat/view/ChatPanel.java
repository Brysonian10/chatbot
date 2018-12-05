package chat.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;
import chat.controller.ChatController;

public class ChatPanel extends JPanel
{
	private JTextField chatField;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadingButton;
	private JButton savingButton;
	private SpringLayout appLayout;
	private ChatController appController;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatController appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		savingButton = new JButton("Why");
		loadingButton = new JButton("Starting loading when ever you need to");
		chatButton = new JButton("Chat with the robot here");
		checkerButton = new JButton("Check Text just in case you need to make sure there is nothing bad.");
		
		chatField = new JTextField("Talk to the bot here if you need to explain stuff.", 50);
		chatArea = new JTextArea("Chat Area", 20, 50);
		
		chatPane = new JScrollPane();
		
//		this.appController = appController;
//		appLayout = new SpringLayout();
//		
//		savingButton = new JButton("Save");
//		loadingButton = new JButton("Load");
//		chatButton = new JButton("Chat");
//		checkerButton = new JButton("Check Text");
//		
//		chatField = new JTextField("Talk to the bot here", 50);
//		chatArea = new JTextArea("Chat Area", 20, 50);
//		
//		chatPane = new JScrollPane();
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.GREEN);
		this.add(chatPane);
		this.add(chatButton);
		this.add(savingButton);
		this.add(loadingButton);
		this.add(checkerButton);
		this.add(chatField);
		
	}
	
	
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
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
	
	private void setupLayout()
	{
		
	}
	
}
