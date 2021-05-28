package testCases;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogs {

	public static Logger log = Logger.getLogger(TestLogs.class.getName());

	public static void main(String[] args) {

		/*
		 * PropertyConfigurator.configure("./properties/log4j.properties");
		 * 
		 * log.info("This is Information logger"); log.error("This is Error logger");
		 * log.debug("This is Debug logger");
		 * 
		 */

		Date d = new Date();
		String s = d.toString().replace(":", "_").replace(" ", "_");
		System.setProperty("current.date", s);
		PropertyConfigurator.configure("./properties/log4j2_New.properties");
		
		
		log.info("This is Information logger");
		log.error("This is Error logger");
		

	}

}
