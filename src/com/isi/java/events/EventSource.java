package com.isi.java.events;

import java.util.ArrayList;

public class EventSource 
{
	
	private double value = 0d;
	private double max = 10d;
	private boolean finished = false;
	
	//3 getters
	public double getValue() {return value;}
	public double getMax() {return max;}
	public boolean isFinished() {return finished;}
	
	private ArrayList<IListener>  listeners = new ArrayList<IListener>();
	
	public EventSource(double max)
	{
		this.max = max;
	}
	
	public void addListener(IListener listener)
	{
		listeners.add(listener);
		System.out.println("Event Source : added Listener");
	}
	
	public void removeListener(IListener listener)
	{
		listeners.remove(listener);
		System.out.println("Event Source : Removed Listener");

	}
	//can be other code
	//JButton
	//manage behaviour and appearance
	private void notifyListeners() 
	{
		System.out.println("Event Source: Notifying all listeners");

		for(IListener listener : listeners)
		{
			listener.eventOccured(new Event(this));//passing and object of source
		}

	}
	
	
	private void setValue(double value)
	{
		if(value >= max)
		{
			value = max;
			finished = true;
		}
		
		this.value = value;
		System.out.println("Event Source Setting Value : " + value);
		notifyListeners();
	}
	
	public void start() 
	{
		System.out.println("Event Source : Starting ");

		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				System.out.println("Inside start");
				// TODO Auto-generated method stub
				while(!finished)
				{
					//value += 0.5d;
					setValue(value + 0.5d);
					
					try 
					{
						Thread.sleep(500);

					} catch (InterruptedException e) 
					{
						// TODO: handle exception
						e.printStackTrace();
					}
					//error
				}
				
			}
		});
		t.start();
		
	}
}