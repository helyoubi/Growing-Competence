package fr.gc.tests;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import fr.gc.pojo.CalcClass;
import fr.gc.pojo.CalcClass2;

public class CalcTest {

	public static void main(String[] args) {
		List<BigDecimal> listBigDec = Arrays.asList(BigDecimal.ONE,BigDecimal.valueOf(2),BigDecimal.valueOf(3),BigDecimal.valueOf(4));
		List<String> listStrings = Arrays.asList("e","b","k","z");
		//pour tester le non accès à la boucle
		List<String> emptylist = new ArrayList<String>();
		String stringCondTrue = "e";
		//pour tester l accès de la condition
		String stringCondTFalse = "c";
		List<CalcClass> listCalc = new ArrayList<>();
		BigDecimal calcTest = BigDecimal.ZERO;
		CalcClass calcClass = null ;
		for (String string : listStrings) {
		  if(listStrings.contains(stringCondTrue)) {
			for (BigDecimal bigDecimal : listBigDec) {	
				    calcClass = new CalcClass();
					calcClass.setStringChar(string);
					calcTest = calcTest.add(bigDecimal);	
					calcClass.setResult(calcTest);
				}					
			}
		  if(calcClass!=null) {
			 listCalc.add(calcClass);
			//init la somme apres chaque add	
			calcTest = BigDecimal.ZERO;
		  }  
		}
		//trie par string attribus
		Collections.sort(listCalc);
		//trie desc Collections.sort(listCalc, Collections.reverseOrder());
		iterateList(listCalc);
		
		System.out.println("--------CalcClass2----------");
		//List CalcClass2
		List<CalcClass2> listCalc2 = new ArrayList<CalcClass2>();
		for (CalcClass calcClassIterator : listCalc) {
			CalcClass2 calcClass2 = new CalcClass2();
			calcClass2.setStringChar(calcClassIterator.getStringChar());
			calcClass2.setResult(calcClassIterator.getResult());
			listCalc2.add(calcClass2);
		}

		//parcours que les listes extends a CalcClass
		iterateCalcClassOnlyList(listCalc2);
	}
	
	/**
	 * Parcours tous les différents types de listes
	 * 
	 * @param <T> type de la liste
	 * @param list liste à parcourir 
	 */
	private static <T> void iterateList(List<T> list) {
		for (T tElements : list) {
			if(tElements instanceof CalcClass) {
				System.out.println(((CalcClass) tElements).getStringChar());
				System.out.println(((CalcClass) tElements).getResult());
			}else {
				System.out.println(tElements);
			}		
		}
	}
	
	/**
	 * Parcours que les tableaux qui hérite de l objet CalcClass
	 * 
	 * @param <T> liste extends a CalcClass
	 * @param list liste à parcourir 
	 */
	private static <T extends CalcClass> void iterateCalcClassOnlyList(List<T> calcClass) {
		for (T tElements : calcClass) {
				System.out.println(tElements.getStringChar());
				System.out.println(tElements.getResult());
			}	
		
	}
	
	

}
