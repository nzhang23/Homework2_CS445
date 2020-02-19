package homework2_5;

import java.util.StringTokenizer;

public class ImprovedStringTokenizer extends StringTokenizer {

	public ImprovedStringTokenizer(String str) {
		super(str);
	}

	public ImprovedStringTokenizer(String str, String delim) {
		super(str, delim);
	}

	public ImprovedStringTokenizer(String str, String delim, boolean returnDelims) {
		super(str, delim, returnDelims);
	}

	public String[] return_all_words_in_array(){
		String[] s;
		int length = this.countTokens();
		int i=0;
		s= new String[length];
		while (hasMoreTokens()||i<length) {
			 s[i]=nextToken();
		     i++;
		}
		return s;
	}
	
	public static void main(String[] args) {
        String[] a;
		ImprovedStringTokenizer I= new ImprovedStringTokenizer("This is a new Class");
		
		a=I.return_all_words_in_array();
		
		for(int i=0;i<5;i++)
		 System.out.println(a[i]);
	}

}
