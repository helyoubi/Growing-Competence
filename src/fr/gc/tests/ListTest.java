package fr.gc.tests;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import fr.gc.pojo.CalcClass;

public class ListTest {

	public static void main(String[] args) {
		/**LinkdedList**/
		// déclaration de linked list
	      LinkedList<String> ll = new LinkedList<String>();
	      // remplir les éléments dans linked list
	      ll.add("C");
	      ll.add("D");
	      ll.add("T");
	      ll.add("V");
	      ll.addFirst("A");
	      ll.addLast("Z");
	      ll.add(1, "B");
	      
	      //linked list trie en asc
	      System.out.println("Contenu original: " + ll);

	      // remove elements from the linked list
	      ll.remove("F");
	      ll.remove(2);
	      ll.removeFirst();
	      System.out.println("Après suppression: "
	       + ll);

	      // modification de la valeur de l'objet à l'indice 3
	      String first = (String) ll.getFirst();
	      int index = ll.indexOf(first);
	      ll.set(index, first + " Nouveau");
	      System.out.println("Aprés modification: " + ll);
	      
	      System.out.println("-------------------------------------------------------------");
	      /**List (CalcClass)**/
			List<CalcClass> listDeString = new ArrayList<>(5);		
			listDeString.add(new CalcClass("cle", BigDecimal.valueOf(10)));
			listDeString.add(new CalcClass("cle1", BigDecimal.valueOf(11)));
			listDeString.add(new CalcClass("cle2", BigDecimal.valueOf(12)));
			//indexOf récupère le premier index de l element et lastIndexOf le dernier index de l element
			//index 2 => cle2
			System.out.println(listDeString.get(2));
			
	      
	      
	}


}
