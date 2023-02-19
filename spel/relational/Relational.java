package com.java.spel.relational;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Relational {
	@Value("#{1 == 1}") // true
	private boolean equal1;

	@Value("#{1 eq 1}") // true
	private boolean equalAlphabetic2;

	@Value("#{1 != 1}") // false
	private boolean notEqual;

	@Value("#{1 ne 1}") // false
	private boolean notEqualAlphabetic3;

	@Value("#{1 < 1}") // false
	private boolean lessThan4;

	@Value("#{1 lt 1}") // false
	private boolean lessThanAlphabetic5;

	@Value("#{1 <= 1}") // true
	private boolean lessThanOrEqual6;

	@Value("#{1 le 1}") // true
	private boolean lessThanOrEqualAlphabetic7;

	@Value("#{1 > 1}") // false
	private boolean greaterThan8;

	@Value("#{1 gt 1}") // false
	private boolean greaterThanAlphabetic9;

	@Value("#{1 >= 1}") // true
	private boolean greaterThanOrEqual10;

	@Value("#{1 ge 1}") // true
	private boolean greaterThanOrEqualAlphabetic11;

	public boolean isEqual1() {
		return equal1;
	}

	public void setEqual1(boolean equal1) {
		this.equal1 = equal1;
	}

	public boolean isEqualAlphabetic2() {
		return equalAlphabetic2;
	}

	public void setEqualAlphabetic2(boolean equalAlphabetic2) {
		this.equalAlphabetic2 = equalAlphabetic2;
	}

	public boolean isNotEqual() {
		return notEqual;
	}

	public void setNotEqual(boolean notEqual) {
		this.notEqual = notEqual;
	}

	public boolean isNotEqualAlphabetic3() {
		return notEqualAlphabetic3;
	}

	public void setNotEqualAlphabetic3(boolean notEqualAlphabetic3) {
		this.notEqualAlphabetic3 = notEqualAlphabetic3;
	}

	public boolean isLessThan4() {
		return lessThan4;
	}

	public void setLessThan4(boolean lessThan4) {
		this.lessThan4 = lessThan4;
	}

	public boolean isLessThanAlphabetic5() {
		return lessThanAlphabetic5;
	}

	public void setLessThanAlphabetic5(boolean lessThanAlphabetic5) {
		this.lessThanAlphabetic5 = lessThanAlphabetic5;
	}

	public boolean isLessThanOrEqual6() {
		return lessThanOrEqual6;
	}

	public void setLessThanOrEqual6(boolean lessThanOrEqual6) {
		this.lessThanOrEqual6 = lessThanOrEqual6;
	}

	public boolean isLessThanOrEqualAlphabetic7() {
		return lessThanOrEqualAlphabetic7;
	}

	public void setLessThanOrEqualAlphabetic7(boolean lessThanOrEqualAlphabetic7) {
		this.lessThanOrEqualAlphabetic7 = lessThanOrEqualAlphabetic7;
	}

	public boolean isGreaterThan8() {
		return greaterThan8;
	}

	public void setGreaterThan8(boolean greaterThan8) {
		this.greaterThan8 = greaterThan8;
	}

	public boolean isGreaterThanAlphabetic9() {
		return greaterThanAlphabetic9;
	}

	public void setGreaterThanAlphabetic9(boolean greaterThanAlphabetic9) {
		this.greaterThanAlphabetic9 = greaterThanAlphabetic9;
	}

	public boolean isGreaterThanOrEqual10() {
		return greaterThanOrEqual10;
	}

	public void setGreaterThanOrEqual10(boolean greaterThanOrEqual10) {
		this.greaterThanOrEqual10 = greaterThanOrEqual10;
	}

	public boolean isGreaterThanOrEqualAlphabetic11() {
		return greaterThanOrEqualAlphabetic11;
	}

	public void setGreaterThanOrEqualAlphabetic11(boolean greaterThanOrEqualAlphabetic11) {
		this.greaterThanOrEqualAlphabetic11 = greaterThanOrEqualAlphabetic11;
	}

	@Override
	public String toString() {
		return "                 Relational"+"\n"+ "[equal1=" + equal1 + ", equalAlphabetic2=" + equalAlphabetic2 + ", notEqual=" + notEqual+"\n"
				+ "notEqualAlphabetic3=" + notEqualAlphabetic3 + ", lessThan4=" + lessThan4 + "\n"+"lessThanAlphabetic5="
				+ lessThanAlphabetic5 + ", lessThanOrEqual6=" + lessThanOrEqual6 +"\n" +"lessThanOrEqualAlphabetic7="
				+ lessThanOrEqualAlphabetic7 + ", greaterThan8=" + greaterThan8 + "\n"+"greaterThanAlphabetic9="
				+ greaterThanAlphabetic9 + ", greaterThanOrEqual10=" + greaterThanOrEqual10+"\n"
				+ "greaterThanOrEqualAlphabetic11=" + greaterThanOrEqualAlphabetic11 + "]";
	}

}
