
	import java.io.BufferedInputStream;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	public class FileBuffer {
		public static void main(String[] args)  {
	FileInputStream fn;
	try {
		fn = new FileInputStream("C:\\Users\\hello\\Downloads\\database");
	BufferedInputStream bn=new BufferedInputStream(fn);
	int size=fn.available();
	byte b[]=new byte[size];
	fn.read(b);
	String data=new String(b);
	System.out.println("The content of file read using BufferedInputStream is: "+data);
	}

	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	}
