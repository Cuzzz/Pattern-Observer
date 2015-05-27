package com.areznikov.patterns.observer.frombox;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ObserverImpl implements Observer {

	private ArrayList<String> matchLog = new ArrayList<String>();
	
	Observable observable ;
	
	public ObserverImpl(){
	}
	
	public ObserverImpl(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	
	public String getLastMsg(){
		if(this.matchLog.size() == 0)
			return "Ещё не было получено сообщений по подписке";
		String lastMsg = this.matchLog.get(matchLog.size()-1);
		return lastMsg; 
	}

	public void update(Observable o, Object arg) {
		if (o instanceof SubjectImpl ){
			SubjectImpl subject = (SubjectImpl) o;
			this.matchLog.add(subject.getMsg());
		}
		
	}

}
