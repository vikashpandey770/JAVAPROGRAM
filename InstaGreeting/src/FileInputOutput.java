import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) throws  IOException {
		System.out.println("this is a file write read");
	
		FileOutputStream fos=new FileOutputStream("tops.txt");
		String sr="my name is pandey vikash";
		byte b[]=sr.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("file write successfully");
		
		
		FileInputStream fis=new FileInputStream("tops.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.println((char)i);
		}
		fis.close();
	}
}
