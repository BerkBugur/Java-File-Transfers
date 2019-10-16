
import java.io.*;
import java.net.*;

public class fileclient {
 public static void main (String[] args)throws Exception {
	 
	byte []b=new byte[20002];
	Socket sr= new Socket("192.168.88.53",1198);
	InputStream is = sr.getInputStream();
	FileOutputStream fr=new FileOutputStream("D:\\deneme1.txt");
	is.read(b,0,b.length);
	fr.write(b,0,b.length);
}
}
