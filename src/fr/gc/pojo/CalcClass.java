package fr.gc.pojo;

import java.math.BigDecimal;

public class CalcClass implements Comparable<CalcClass>{

	private String stringChar;
	private BigDecimal result;
	private BigDecimal result2;
	
	public CalcClass () {
		//default contructor
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
	
	
	public BigDecimal getResult2() {
		return result2;
	}
	public void setResult2(BigDecimal result2) {
		this.result2 = result2;
	}
	
	@Override
	public int compareTo(CalcClass o) {
		 int c;
		    c = this.getStringChar().compareTo(o.getStringChar());
		    if (c == 0) {
		       c = this.getResult().compareTo(o.getResult());
		    }
		    if (c == 0) {
		       c = this.getResult2().compareTo(o.getResult2());
		    }
		    return c;
	}
	
	@Override
	public String toString() {
		return "CalcClass [getStringChar()=" + getStringChar() + ", getResult()=" + getResult() + ", getResult2()="
				+ getResult2() + "]";
	}
	
	
	
	
}
