package homework2_5;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ImprovedStringTokenizer_test {

	@Test
	public void return_all_words_in_array_test() {
		ImprovedStringTokenizer I = new ImprovedStringTokenizer("This is a new Class");
		String[] a;
		a = I.return_all_words_in_array();
		assertEquals(a[0],"This");
		assertEquals(a[1],"is");
		assertEquals(a[2],"a");
		assertEquals(a[3],"new");
		assertEquals(a[4],"Class");	
	}

}
