package com.java.spel.invoke.booleantype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Type {
	@Value("#{8>3}")
private boolean isActive;

public boolean isActive() {
	return isActive;
}

public void setActive(boolean isActive) {
	this.isActive = isActive;
}

@Override
public String toString() {
	return "Type [isActive=" + isActive + "]";
}

}
