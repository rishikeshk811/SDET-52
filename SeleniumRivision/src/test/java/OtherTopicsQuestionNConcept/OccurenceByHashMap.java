package OtherTopicsQuestionNConcept;

import java.util.HashMap;

import org.apache.commons.collections4.map.HashedMap;

public class OccurenceByHashMap {

	public static void main(String[] args) {	
String nameString="RishikeshSinghRajput";
    char []ch =nameString.toCharArray();
HashMap<Character, Integer> hs =new HashMap();
for(int i=0;i<ch.length;i++) {
	if (hs.containsKey(ch[i])) {
		hs.put(ch[i], hs.get(ch[i])+1);
	}
	else {
		hs.put(ch[i], 1);
	}
}
System.out.println(hs);
	}

}
