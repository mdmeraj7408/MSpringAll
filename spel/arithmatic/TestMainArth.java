package com.java.spel.arithmatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestMainArth {

	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/java/spel/arithmatic/config.xml");
		ArithmatiOpretor art=context.getBean("arithmatiOpretor",ArithmatiOpretor.class);
             System.out.println(art);
             
             System.out.println("---------------------------------------------------");
             
             SpelExpressionParser spl=new SpelExpressionParser();
             Expression exp=spl.parseExpression("1234>787");
            Boolean result=(Boolean)exp.getValue();
             System.out.println(result);
             
	}

}
