package com.isi.java.events;

public class Event 
{
	//private Object source;
	private EventSource source;
	
	public Event(EventSource source)
	{
		this.source = source;
	}
	
	public EventSource getSource() 
	{
		return source;
	}
	

}
