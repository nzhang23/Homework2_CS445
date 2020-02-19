package homework2_4;

import java.util.Random;

public class ImprovedRandom extends Random {

	public ImprovedRandom() {
		super();
	}

	public ImprovedRandom(long seed) {
		super(seed);
	}
	
    public int Generate_int_from_two_different_integers(int a, int b){
    	int val = nextInt(10);
    	if(val<5)//make the probability into 0.5 to return a.
    	   return a;
    	else
    	   return b;
    }
}
