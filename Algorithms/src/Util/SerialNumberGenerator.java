package Util;

import java.util.Random;

public class SerialNumberGenerator {

	static int count = -1;
	
	public static int getRandomNumber(){
		count = count + 1;
		System.out.println(count);
		return count;
	}
}
