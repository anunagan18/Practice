package problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SampleFile {

	public static void main(String args[]){
		//File f = new File("c:\\Test\\sample.txt");
		
		FileInputStream in = null;
				
		try{
			
			in = new FileInputStream("c:\\Test\\sample.txt");
			int content;
			
			while((content = in.read()) != -1){
				System.out.print(String.valueOf((char)content));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				if (in != null)
					in.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
}

