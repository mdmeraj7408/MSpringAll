package com.java.spel.invoke.variable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Root {
	@Value("#{T(java.lang.Math).sqrt(23) }")
    private double z;
    @Value("#{T(java.lang.Math).sin(10)}")
    private double s;
    @Value("#{T(java.lang.Math).toRadians(2)}")
    private double toradians;
    @Value("#{T(java.lang.Math).E}")
    private double e;
    @Value("#{T(java.lang.Math).PI}")
    private double p;
    @Value("#{ new java.lang.String('Meraj Alam') }")
    private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getToradians() {
		return toradians;
	}

	public void setToradians(double toradians) {
		this.toradians = toradians;
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Root [z=" + z + ", s=" + s + ", toradians=" + toradians + ", e=" + e + ", p=" + p + ", name=" + name
				+ "]";
	}
 
}
