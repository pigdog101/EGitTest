package com.mzw.mode.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
	private List<Observer> list = new ArrayList<Observer>();
	@Override
	public void addObserver(Observer observer) {
		this.list.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		this.list.remove(observer);
	}

	@Override
	public void notifyObserver(Observer observer) {
		for(Observer ob:list) {
			ob.update();
		}
	}


}
