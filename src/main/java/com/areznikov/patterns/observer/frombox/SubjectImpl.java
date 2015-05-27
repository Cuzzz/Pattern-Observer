package com.areznikov.patterns.observer.frombox;

import java.util.Observable;

public class SubjectImpl extends Observable {

	
	private int scoreFirstTeam;
	
	private int scoreSecondTeam;
	
	public SubjectImpl()
	{
	}
	
	public void scoreChanged()
	{
		setChanged();
		notifyObservers();
	}
	
	
	public void goal(int teamNumber)
	{
		if (teamNumber == 1)
			scoreFirstTeam += 1;
		else if (teamNumber == 2)
			scoreSecondTeam += 1;
		scoreChanged();
	}
	
	public String getMsg(){
		return "ГОЛ! Счёт в матче теперь "+scoreFirstTeam+" : "+scoreSecondTeam +" !!!";
	}

}
