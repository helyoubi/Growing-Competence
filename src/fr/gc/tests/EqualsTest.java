package fr.gc.tests;

import java.math.BigDecimal;

import fr.gc.pojo.CalcClass;

public class EqualsTest {

	public static void main(String[] args) {
		CalcClass calc1 = new CalcClass("cle1", BigDecimal.valueOf(12.9784));
		CalcClass calc2 = new CalcClass("cle2", BigDecimal.valueOf(13));
		CalcClass calc3 = calc2;
		System.out.println(calc1==calc2);
		System.out.println(calc2==calc3);
		System.out.println(calc1.equals(calc2));
		System.out.println(calc2.equals(calc3));
		
		//Overding equals
		CalcClass calc4 = new CalcClass("cle", BigDecimal.valueOf(10));
		CalcClass calc5 = new CalcClass("cle", null);
		System.out.println("Overiding equals : "+calc4.equals(calc5));
	}

}
