
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.*;
public class FlleBufferoutput{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
            FileOutputStream fout=new FileOutputStream("..//newfile.txt");   
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            Scanner in=new Scanner(System.in);
            String s=in.nextLine();
            int roll=in.nextInt();
            byte []arr=("Welcome "+s+" your emp id is "+roll).getBytes();
            bout.write(arr);
            bout.close();    
            fout.close();
          }catch(Exception e){System.out.println(e);} 

	}

}
