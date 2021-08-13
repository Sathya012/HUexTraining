package solveTheQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String infra []= {"cat","dog","horse","cat","horse"};
		 printDuplicateCharacter("jihdkniuehiai");
		 printElement();
		  printElement() ;
	}
	
	public static void printDuplicateCharacter(String str) {
		char words []= str.toCharArray();
		Map<Character,Integer> a = new HashMap <Character,Integer>();
		for (Character e : words) {
			if(a.containsKey(e)) {
				a.put(e, a.get(e)+1);
			}
			else {
				a.put(e,1);
			}
		}
	Set<Map.Entry<Character,Integer>> entryset= a.entrySet();
	for(Map.Entry<Character,Integer> entry : entryset ) {
		if(entry.getValue()>1)
		System.out.println(entry.getKey() + ":" + entry.getValue());
	}
	System.out.println("-------------------------------------------------------");
	}	
	
public static void printElement() {
	String infra []= {"cat","dog","horse","cat","horse"};
		Set<String> dup =new HashSet <String>();
		for(String e: infra) {
			if(dup.add(e)==false) {
				System.out.println(e );
			}
		}
	System.out.println("-------------------------------------------------------");
	}
		
		public static void animalPrintElement() {
		String infra []= {"cat","dog","horse","cat","horse"};
	for(int i=0;i<infra.length; i++) {
		for(int j=i+1;j<infra.length; j++) {
			if(infra[i].equals(infra[j])) {
				System.out.println(infra[i]);
			}
		}
	}
		
}
	
	
	
	
	
	
	

}
