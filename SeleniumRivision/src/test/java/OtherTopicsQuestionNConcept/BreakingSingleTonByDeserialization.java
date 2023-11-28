package OtherTopicsQuestionNConcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakingSingleTonByDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SingletonDeserialization s2=SingletonDeserialization.getSingletonDeserializationRef();
		s2.name="Rishikesh";
		s2.age=24;
		s2.salary=49999999.5;
		System.out.println(s2.hashCode());
//		System.out.println(s2.name);
	
		
		
		FileOutputStream fos =new FileOutputStream("C:\\Users\\kinshu raj\\OneDrive\\Desktop/SingletonDeserial.txt");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(s2);
		System.out.println("Serialisation done");
		FileInputStream fis =new FileInputStream("C:\\Users\\kinshu raj\\OneDrive\\Desktop/SingletonDeserial.txt");
		ObjectInputStream ois =new ObjectInputStream(fis);
		SingletonDeserialization os   =	(SingletonDeserialization) ois.readObject();
		System.out.println(os.hashCode());
		System.out.println(os.name);
	}

}
