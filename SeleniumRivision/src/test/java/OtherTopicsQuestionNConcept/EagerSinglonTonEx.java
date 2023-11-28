package OtherTopicsQuestionNConcept;

public class EagerSinglonTonEx {
	 
	
static	EagerSinglonTonEx  s=new EagerSinglonTonEx();
	private EagerSinglonTonEx() {
		
	}
// Eager way of Creating singleton Object
	public static EagerSinglonTonEx  getObjectRef() {
		

		
		return s;
		
	}
	 
	
	
	
	public static void main(String[] args) {
		EagerSinglonTonEx s1     = getObjectRef();
		System.out.println(s1.hashCode());
		EagerSinglonTonEx s2=getObjectRef();
		System.out.println(s2.hashCode());
		
		
		
	}

}
