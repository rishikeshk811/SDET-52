package OtherTopicsQuestionNConcept;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm;
import org.apache.commons.math3.geometry.spherical.oned.S1Point;
import org.openqa.selenium.devtools.HasDevTools;

public class BreakSingleTon {
      // 4 way of Breaking SingleTon Pattern
	    /*     public static void main(String[] args) throws Exception, SecurityException {
	           SingleTonClass s1= SingleTonClass.getObjectRefOfSingletonClass();
	           System.out.println(s1.hashCode());
	          Constructor constructor= s1.getClass().getDeclaredConstructor();//we will get the reference of Constructor ,to Represeent this we have separate Constructor clas
	       // using this constructor reference we will call newInstance() method
	          constructor.setAccessible(true);
	          SingleTonClass s2   = (SingleTonClass) constructor.newInstance();
	          System.out.println(s2.hashCode());    */
	          
	          
	          
	  
	          
	          
	          
	          
	          
	          // we can Resolve this -- if we have already Created Object ,then we will throw exception from inside the constructor
	

 /*    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	         SingleTonpattern3 s=   SingleTonpattern3.INSTANCE;
	         System.out.println(s.hashCode());
	         s.test();
	      
	         SingleTonpattern3.staticMehtod();
	            Constructor constructor=  s.getClass().getDeclaredConstructor();//NoSuchMethodException --because  there is not Constructor ,so we can not call this method.
        constructor.setAccessible(true);
                SingleTonpattern3 s2= (SingleTonpattern3) constructor.newInstance();
                System.out.println(s2.hashCode());
}    */
	
// by using Clone Method we can break the Singleton Pattern 
	    public static void main(String[] args) throws CloneNotSupportedException {
	    	 SingleTonPattern4 s2=SingleTonPattern4.getSingleTonPattern4Ref();
	    	 System.out.println(s2.hashCode());
	    	    SingleTonPattern4 s3=s2.clone();
	    	    System.out.println(s3.hashCode());
		}
    	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


