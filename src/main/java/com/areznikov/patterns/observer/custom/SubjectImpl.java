package com.areznikov.patterns.observer.custom;

import java.util.HashSet;
import java.util.Set;

public class SubjectImpl implements Subject {

	private Set<Observer> observers;
	
	private int scoreFirstTeam;
	
	private int scoreSecondTeam;
	
	public SubjectImpl()
	{
		this.observers = new HashSet<Observer>();
	}
	
	public void registerObserver(Observer o) {
		this.observers.add(o);		
	}

	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer observer : this.observers){
			observer.update("ГОЛ! Счёт в матче теперь "+scoreFirstTeam+" : "+scoreSecondTeam +" !!!");
		}
	}
	
	public void goal(int teamNumber)
	{
		if (teamNumber == 1)
			scoreFirstTeam += 1;
		else if (teamNumber == 2)
			scoreSecondTeam += 1;
		notifyObservers();
	}

}
