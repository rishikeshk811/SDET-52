package OtherTopicsQuestionNConcept;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import javax.management.loading.PrivateClassLoader;

public class SingleTonClass {
	

  /*  private static	SingleTonClass s;
 
	private SingleTonClass() {
		
		
	}
	//lazy way of Creating of Creating Object 
	public static SingleTonClass  getObjectRef() {
		if (s==null) {
			
			
			
			
			
			
			
			
			synchronized (SingleTonClass.class) {
				s=new SingleTonClass();
			}
		}
		
		
		
		
		
		return s;
		
	}
	public static void main(String[] args) {

		/*	   SingleTonClass s1=getObjectRef();
	System.out.println(s1.hashCode());
		SingleTonClass s2    =getObjectRef();
		System.out.println(s2.hashCode());   */ 
		
 
 
		
		private static SingleTonClass s=new SingleTonClass();
		
		private   SingleTonClass() {
			if (s!=null) {
				throw new RuntimeException("You are trying to Break SingleTon Pattern");
			}
		}
		public static SingleTonClass getObjectRefOfSingletonClass() {
			return s;
		}
		
		public static void main(String[] args) {
			
		}
		
	}









