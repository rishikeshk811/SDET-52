package OtherTopicsQuestionNConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialisationExample {

	public static void main(String[] args) throws IOException, Exception {
	//	File f =new File("C:\Users\kinshu raj\OneDrive\Desktop\Serial.txt");
		FileInputStream fis =new FileInputStream("C:\\Users\\kinshu raj\\OneDrive\\Desktop\\Serial.txt");
	
		
		
		
		
		
		ObjectInputStream ois =new java.io.ObjectInputStream(fis);
		CustomerData cdo=(CustomerData) ois.readObject();
		System.out.println(cdo); 
		// invlidClassException ,if we changes in serialisable class and that is not stored in file and trying to  Deserialized the file
		System.out.println(cdo.getCustomername());
	}
}
