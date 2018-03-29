import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		//initializes scanners
		Scanner keyboard = new Scanner(System.in);
		
		//creates all the variables needed, including the counters for the line number and query counter
		String fileToRead = "redditPosts";
		int counter = 0;
		int lineNum = 1;
		
		{
			//Shows that program is running
			System.out.println("ready to read:"+fileToRead);
			
			//try-catch statement so that files can be read without error
			try
			{
				
				//starts buffered reader
				FileReader myFileReader=new FileReader(fileToRead);
				BufferedReader myBufferReader= new BufferedReader(myFileReader);
				String line=null;
				
				//asks user for search query
				System.out.println("What word would you like to search for?");
				String query = keyboard.nextLine();
				
				//goes through file, searching for instances of query
				while((line=myBufferReader.readLine())!=null)
				{
					//records line number and adds to counter if line contains sought word
				    if(line.contains(query))
				    {
				    	System.out.println(lineNum);
				    	counter ++;
				    }
				    lineNum++;
				}
				
				//closes reader
				myBufferReader.close();
				
				//outputs info to user
				System.out.println("Your word appears in all of the lines listed above.\n");
			    System.out.println("Your word appears this many times: "+ counter);
				
			}
			catch (Exception ex)
			{
				System.out.println("I don't think I was able to find your file");
			}
		}
		
		//closes keyboard
		keyboard.close();
	}
}
	
	

