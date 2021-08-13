package solveTheQuestions;

import java.util.HashMap;
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class combineTheArray {

	public static void main(String[] args) {
		array();
	}
public static void array () {
	String str1[] = {"kit kat,dairy, galaxy"};
String str2[] = {"tomato.potato,cabbage"};
	
	HashSet<String> a=new HashSet<String>() ;
	a.add("kit kat");
	a.add("dairy");
	
	HashSet<String> b=new HashSet<String>() ;
	b.add("tomato");
	
	a.addAll(b);
	System.out.println(a);
//	System.out.println(str1);
int e=	str1.length;
	int f= str2.length;
	int g = e+f;
	System.out.println(e+1);
}
}
