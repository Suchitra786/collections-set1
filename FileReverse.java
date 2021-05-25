
	import java.util.*;
	import java.io.*;

	public class FileReverse 
	{
		public static void main (String [] args)throws IOException
		{
			FileReader fr = new FileReader("C:\\Users\\hello\\Downloads\\database");
			BufferedReader br = new BufferedReader(fr);

			String data;  
	        
			while ((data = br.readLine()) != null){
			    String[] words = data.split(" ");
			    for(String a: words)
			    {
			        StringBuilder builder=new StringBuilder(a);
			        System.out.print(builder.reverse().toString()+" ");
			    }  
			}
		}
	}
