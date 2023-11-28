package OtherTopicsQuestionNConcept;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationandDserialisation {

	public static void main(String[] args) throws IOException {

		/* the process of conversion of Object into byte Stream is called Serialization,it is done to --
		1. to Transfer the data over the network on real Time .
		2. to Store in file and send the file 
		3. to send byte Stream file directly to the Other Computer(person).
		Deserialization --it is the reverse process of Serialization ,in which the Conversion of byte Stream into Object Take place.
		so, that other person can use/read this Object .without deserialisation ,Human can nOt read that byte Stream file.
 
 ObjectOnputStreaam class
 WriteObject() method 
 
 
 
 ObjectInputStream class 
 readObject() method .
	*/
		CustomerData cd = new CustomerData("Mukesh",32,"Development",490000.9,8989786754l);
		System.out.println(cd.getCustomername());
		FileOutputStream fos =new FileOutputStream("C:\\Users\\kinshu raj\\OneDrive\\Desktop/Serial.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(cd); 
		System.out.println(" Serialization Done");
		
		
		
	}
}






