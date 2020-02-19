package homework2_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImprovedRandomTest {

	@Test
	public void Generate_int_from_two_different_integers_test() {
		
		ImprovedRandom R = new ImprovedRandom();
		ImprovedRandom R1 = new ImprovedRandom();
		
		int val_R= R.Generate_int_from_two_different_integers(5, 8);
		int val_R1 = R1.Generate_int_from_two_different_integers(5, 8);
		System.out.println(val_R);
		System.out.println(val_R1);
	}

}
