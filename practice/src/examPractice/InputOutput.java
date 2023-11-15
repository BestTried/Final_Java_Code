package examPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {

	public static void main(String[] args)  {
		String [] names  = {"Ram", "Jadu","Madhu"};

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
			writer.write("Hello, there is something");
			writer.write("\nHello, who is this");
			
			for(String name : names) {
				writer.write("\n"+name);
			}
			writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
				try {
					BufferedReader reader = new BufferedReader(new FileReader("Output.txt"));
				
				System.out.println(reader.readLine());
				reader.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			
			
			
	}
	}


