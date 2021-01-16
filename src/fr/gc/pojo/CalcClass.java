package fr.gc.pojo;

import java.math.BigDecimal;
import java.util.Objects;

public class CalcClass implements Comparable<CalcClass>{

	private String stringChar;
	private BigDecimal result;
	
	public CalcClass () {
		//default contructor
	}

	/**
	 * Constructeur de String/Bigdecimal pour la classe calcul
	 * 
	 * @param stringChar clé string
	 * @param result resultat en Bigdecimal
	 */
	public CalcClass(String stringChar, BigDecimal result) {
		super();
		this.stringChar = stringChar;
		this.result = result;
	}

	public String getStringChar() {
		return stringChar;
	}
	public void setStringChar(String stringChar) {
		this.stringChar = stringChar;
	}
	public BigDecimal getResult() {
		return result;
	}
	public void setResult(BigDecimal result) {
		this.result = result;
	}
	
	@Override
	public int compareTo(CalcClass o) {
		 int c;
		    c = this.getStringChar().compareTo(o.getStringChar());
		    if (c == 0) {
		       c = this.getResult().compareTo(o.getResult());
		    }
		    return c;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(stringChar,result);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if (!(obj instanceof CalcClass)) {
			return false;
		}
		CalcClass other = (CalcClass) obj;
		return Objects.equals(stringChar, other.stringChar) && Objects.equals(result, other.result);
	}

	@Override
	public String toString() {
		return "CalcClass [getStringChar()=" + getStringChar() + ", getResult()=" + getResult() + "]";
	}
	
	
	
	
}
