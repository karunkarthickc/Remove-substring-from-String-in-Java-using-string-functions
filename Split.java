package module2;

public class Split {

	public static void main(String[] args) {
	    String str = "abc ABC 123 abc";
		String s2="acb213";
		for(int i=0;i<s2.length();i++) {
		 str = str.replaceAll(s2.valueOf(s2.charAt(i)), "");
		}
		 
		 
		
		System.out.println(str);
	}
}
