package OtherTopicsQuestionNConcept;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public enum SingleTonpattern3 {
INSTANCE;



// Ennum is internally manage by Class only 
// we can have static and Non-Static method in the Ennum -- and it can be called by Object Reference;
public void test() {
	System.out.println("hii i am Ennum Non-Static Method");

}



public static void staticMehtod() {
	System.out.println("hii i am Static Ennum Method");
	
}
}
