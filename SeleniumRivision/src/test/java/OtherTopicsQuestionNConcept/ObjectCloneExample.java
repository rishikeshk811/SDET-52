package OtherTopicsQuestionNConcept;

public class ObjectCloneExample implements Cloneable {
static	ObjectCloneExample oc;
	
	@Override
	public ObjectCloneExample clone() throws CloneNotSupportedException {
	//	return  (ObjectCloneExample) super.clone();  // break Cloning
		return oc;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		
		 oc =new ObjectCloneExample();
		System.out.println(oc.hashCode());

		
		
		
		ObjectCloneExample oc2   =(ObjectCloneExample) oc.clone();
	System.out.println(oc2.hashCode());
	}

}
