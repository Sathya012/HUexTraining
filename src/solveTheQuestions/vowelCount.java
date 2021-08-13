package solveTheQuestions;

public class vowelCount {

	public static void main(String[] args) {
		String str = "chitrapriya";
		
		int vCount =0;
		for(int e= 0; e< str.length(); e++) {
			if( findVowelCount(str.charAt(e))) {	
			vCount++;
			}
		}
		System.out.println(vCount );
		
		 
	}
public static boolean findVowelCount(char t) {
	
	return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
}
}
