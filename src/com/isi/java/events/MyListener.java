package com.isi.java.events;

public class MyListener implements IListener
{

	@Override
	public void eventOccured(Event e) {
		// TODO Auto-generated method stub
		//new line added
		
		double value = e.getSource().getValue();
		double max = e.getSource().getMax();
		boolean finished = e.getSource().isFinished();
		
		//System.out.println("MyListener: Event occured. Source: " + e.getSource());	
		System.out.println(
				"MyListener: Event occured. value: " + " Value : " + value+ " ,Max :"+ max+ " Finished : "+ finished
				);
	}
}

//simpler one with 3 source