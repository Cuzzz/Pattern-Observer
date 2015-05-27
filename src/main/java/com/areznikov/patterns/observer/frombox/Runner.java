package com.areznikov.patterns.observer.frombox;

public class Runner 
{
    public static void main( String[] args )
    {
    	//create 1 subject
    	SubjectImpl subject = new SubjectImpl();
    	
    	//create 3 observers
    	ObserverImpl observer1 = new ObserverImpl(subject);
    	ObserverImpl observer2 = new ObserverImpl(subject);
    	ObserverImpl observer3 = new ObserverImpl();
    	
    	//game starts and first goal!
    	subject.goal(1);
    	
    	//check observers 
    	System.out.println("------------First observers check------------");
    	System.out.println("Последнее что видел 1ый: " +observer1.getLastMsg());
    	System.out.println("Последнее что видел 2ой: " +observer2.getLastMsg());
    	System.out.println("Последнее что видел 3ий: " +observer3.getLastMsg());
    	System.out.println("---------------------------------------------");
    	
    	//first observer cancel subscription and 3rd just join to game
    	subject.deleteObserver(observer1);
    	subject.addObserver(observer3);
    	
    	//its second goal!
    	subject.goal(2);
    	
    	//over time 2nd can subscription, but here is another goal!
    	subject.deleteObserver(observer2);
    	subject.goal(2);
    	
    	//check observers 
    	System.out.println("------------Last observers check------------");
    	System.out.println("Последнее что видел 1ый: " +observer1.getLastMsg());
    	System.out.println("Последнее что видел 2ой: " +observer2.getLastMsg());
    	System.out.println("Последнее что видел 3ий: " +observer3.getLastMsg());
    	System.out.println("---------------------------------------------");
    }
}
