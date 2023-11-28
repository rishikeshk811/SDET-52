package OtherTopicsQuestionNConcept;

public class SingleTonPattern4 implements Cloneable{
	private static SingleTonPattern4 s ;
	public static SingleTonPattern4 getSingleTonPattern4Ref() {
		if (s==null) {
			s=new SingleTonPattern4();
			
		}
		return s;
	}
@Override
public SingleTonPattern4 clone() throws CloneNotSupportedException {
	return (SingleTonPattern4) super.clone();//break SingleTonPattern
	//  return s;     //can get rid by this ,because even after cloning it is returing  the same Object reference containing same value
	
}
	
	
	
	public static void main(String[] args) {

	}

}
