

	import java.io.BufferedOutputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Scanner;

	public class FIleOutput {
	public static void main(String[] args) {
		FileOutputStream fo=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter id");
		byte id=sc.nextByte();
		try {
			 fo=new FileOutputStream("newFile.txt");
			BufferedOutputStream bs=new BufferedOutputStream(fo);
			byte buf[]=new byte[100];
			buf=name.getBytes();
			bs.write(buf);
			System.out.println("welcome "+name+" your Employee id is"+id );
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				fo.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	}
