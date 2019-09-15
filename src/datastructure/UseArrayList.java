package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> Cars = new ArrayList<String>();

		//Adding values in Arraylist
		Cars.add("Eclipse");
		Cars.add("lambo");
		Cars.add("Supra");
		Cars.add("honda");

		//checking ArrayList
		System.out.println(Cars);

		//removing Nissan
		Cars.remove("honda");

		//after remove checking again ArrayList
		System.out.println("\n"+Cars);


	}

}
