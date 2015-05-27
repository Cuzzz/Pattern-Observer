package com.areznikov.patterns.observer.custom;

import java.util.ArrayList;

public class ObserverImpl implements Observer {

	private ArrayList<String> matchLog;
	
	public ObserverImpl(){
		this.matchLog = new ArrayList<String>();
	}
	
	public void update(String msg) {
		matchLog.add(msg);		
	}
	
	public String getLastMsg(){
		if(this.matchLog.size() == 0)
			return "Ещё не было получено сообщений по подписке";
		String lastMsg = this.matchLog.get(matchLog.size()-1);
		return lastMsg; 
	}

}
