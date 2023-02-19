package com.java.book;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Institute {
       private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	

	public Institute() {
		super();
		
	}
	

	@Override
	public String toString() {
		return "Institue [subject=" + subject + "]";
	}
	@PostConstruct
     public void start()
     {
    	 System.out.println("Started..");
     }
	@PreDestroy
     public void end()
     {
    	 System.out.println("Ended....");
     }
}
