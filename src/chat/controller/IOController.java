package chat.controller;

import java.util.Calendar;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class IOController
{
	public static void saveText(ChatController app, String path, String textToSave)
	{
		try //tests code out
		{
			String filename = path;
			Calendar date = Calendar.getInstance();
			filename += "/" + date.get(Calendar.MONTH) + " " + date.get(Calendar.DAY_OF_MONTH);
			filename += " chatbot save.txt";
			
			File saveFile = new File(filename);
			Scanner textScanner = new Scanner (textToSave);
			PrintWriter saveText = new PrintWriter(saveFile);
			while(textScanner.hasNext())
			{
				String currentLine = textScanner.nextLine();
				saveText.println(currentLine);
			}
			
			textScanner.close();
			saveText.close();
		}
		catch(IOException error) //this catches errors before they break the entire program (specific)
		{
			app.handleErrors(error);
		}
		catch(Exception genericError) //this catches errors before the break the entire program (generic)
		{
			app.handleErrors(genericError);
		}
	}
}
