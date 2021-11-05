package com.sgtesting.testscripts;

import org.apache.log4j.Logger;

public class ForDemo {
	
	static Logger logss=Logger.getLogger("Web-Automaton");
		public static void main(String[] args) {
		logss.info("The For Loop Output Starts here...");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				logss.info("Even Number :"+i);
			}
		}
		logss.info("The For Loop Output Ends here...");

	}

}
