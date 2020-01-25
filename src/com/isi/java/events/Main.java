package com.isi.java.events;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args)
	{
		EventSource source = new EventSource(10);
		EventSource source2 = new EventSource(15);
		
		
		//MyListener mylistener = new MyListener();
		
		MyListener mylistener = new MyListener();
		IListener iListener = (IListener)mylistener;
		
		MyListener myListener2 = new MyListener();
		MyListener myListener3 = new MyListener();
		
		//source.addListener((IListener)Mylistener);
		source.addListener((IListener)mylistener);
		source.addListener((IListener)myListener2);
		source.addListener((IListener)myListener3);//casting not compulsory
		source.start();
		
		source2.addListener((IListener)mylistener);
//		source2.addListener((IListener)myListener2);
//		source2.addListener((IListener)myListener3);//casting not compulsory
		
		source2.start();
		
	}
}
