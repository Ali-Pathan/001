package datastructure;

import java.util.Random;
import java.util.Scanner;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int [] array = new int[4000];
		System.out.println("plz enter numbers: ");
		for(int i=0; i<array.length; i++) {
			array[i] = random.nextInt(10000);
		}

		for(int j=0; j<array.length; j++) {
			System.out.println("Array list : " + array[j]);
		}
	}
}