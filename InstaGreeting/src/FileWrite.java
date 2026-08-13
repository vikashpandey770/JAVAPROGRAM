import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
	
	FileWriter fw=new FileWriter("tops2.txt");
		
	String s="vikash pandey";
	fw.write(s);
	fw.flush();
	fw.close();
	
	FileReader fr=new FileReader("tops2.txt");
	int i;
	while((i=fr.read())!=-1)
	{
		System.out.println((char)i);
	}
	fr.close();
		
	}
}
