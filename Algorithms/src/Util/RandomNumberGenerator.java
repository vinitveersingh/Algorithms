package Util;

import java.util.*;

public class RandomNumberGenerator {
	private final static int range = 100;
	private static int randomNumber;
	
	public static RandomNumberGenerator generateRandomNumber(){
		/*
		 * Random Object Creation can be optimized later if required by just creating it once
		 * and referencing it later on
		 */
		RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
		Random random = new Random();
		randomNumber = random.nextInt(range);
		System.out.println(  randomNumber + " ");
		return randomNumberGenerator;
	}
	
	public static int getRandomNumber(){
		return randomNumber;
	}
	
}
