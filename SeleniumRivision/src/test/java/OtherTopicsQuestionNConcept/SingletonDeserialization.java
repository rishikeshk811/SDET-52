package OtherTopicsQuestionNConcept;

import java.io.Serializable;

public class SingletonDeserialization implements Serializable{
// if we don't implement Serializable interface and try to Serialize then get " NotSerializableException"
	String name;
	int age;
	double salary;
private static	SingletonDeserialization s1;
private  SingletonDeserialization() {
	
}










// how to Avoid from Breaking Singleton By Deserialization Method ---> we Impement readResolve() method. that will return the same Object
 public Object readResolve() {
	return s1;
	
}   

public static SingletonDeserialization getSingletonDeserializationRef() {
	
	if (s1==null) {
		s1=new SingletonDeserialization();
	}
	return s1;
}
	public static void main(String[] args) {

		
	}

}
