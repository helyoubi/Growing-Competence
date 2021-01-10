package fr.gc.tests;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
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

	}

}
