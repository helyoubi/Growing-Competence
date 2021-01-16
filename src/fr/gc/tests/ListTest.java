package fr.gc.tests;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
	      /**List (ArrayList)**/
	      List<String> listDeString = Arrays.asList("cle","cle2","cle3","cle4","cle5","cle6");
	      System.out.println(listDeString.size());
	}

}
