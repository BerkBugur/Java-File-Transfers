import java.io.*;
import java.net.*;

public class fileserver {
	 public static void main (String[] args)throws Exception {
		 ServerSocket s=new ServerSocket(1198);
		 Socket sr= s.accept();
		 FileInputStream fr=new FileInputStream("D:\\deneme.txt");
		 byte b[]= new byte[2002];
		 fr.read(b,0,b.length);
		 OutputStream os = sr.getOutputStream();
		 os.write(b,0,b.length);
		 
	 }
}
