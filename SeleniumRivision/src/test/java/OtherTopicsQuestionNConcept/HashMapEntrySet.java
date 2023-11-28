package OtherTopicsQuestionNConcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class HashMapEntrySet {

	public static void main(String[] args) {
TreeMap<String, String> st=new TreeMap<String,String>();
st.put("rishikesh", "aurangabad bihar , block more 3455 hous3");
		
st.put("mukesh", "odisha bihar , block more 3455 hous3");
st.put("rahul", "patna bihar , block more 3455 hous3");
st.put("manoj", "delhi bihar , block more 3455 hous3");


st.put("ranjan", "chennai bihar , block more 3455 hous3");
st.put("vishleshan", "banglore bihar , block more 3455 hous3");
//System.out.println(st.remove("ranjan"));


HashMap<String, String> hmap =new HashMap<>();
hmap.putAll(st);// it will copy all the entries of the st map into hmap

System.out.println(hmap.containsValue("banglore bihar , block more 3455 hous3"));//true
        Collection<String> allvlues = hmap.values();
        for( String val:allvlues) {
        	System.out.println(val);
        }
//hmap.clear();//clear all the entries of the map
 /*      Set<String> allkey=  hmap.keySet();
       for(String key:allkey) {
    	   System.out.println(hmap.get(key));
       }
System.out.println(hmap);

/*  for(Entry<String, String>  stm :hmap.entrySet()) {
	 
	System.out.println(stm);
}     */

	}

}
