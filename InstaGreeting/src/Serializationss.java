import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	String name;
	int roll;
	int std;
	
	public Student(String name, int roll, int std) {
		super();
		this.name = name;
		this.roll = roll;
		this.std = std;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", std=" + std + "]";
	}
}
public class Serializationss {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("***********Serialization program create**********");
		
		FileOutputStream fos=new FileOutputStream("vikas");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Student s=new Student("vikash pandey",2240,12);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		System.out.println("object written successfully");
		
		FileInputStream fis=new FileInputStream("vikas");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s1=(Student) ois.readObject();
		System.out.println(s1);
		ois.close();
		
		
	}
}
