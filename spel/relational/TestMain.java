package com.java.spel.relational;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestMain {

	public static void main(String[] args) {
		//First way to use annotation
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/java/spel/relational/config.xml");
		Relational st=context.getBean("relational",Relational.class);
		System.out.println(st);

//		SpelExpressionParser spEl= new SpelExpressionParser();
//		Expression exp=spEl.parseExpression("10+22");
//		Integer result=(Integer) exp.getValue();
//		System.out.println(result);
	}

}
