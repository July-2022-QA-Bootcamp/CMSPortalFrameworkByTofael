package reporting;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.Reporter;

public class Logs {
	static Logger logger = Logger.getLogger(Logs.class.getName());

	public static void log(String msg) {
		logger.log(Level.INFO, msg); // it helps to print in console
		Reporter.log(msg + "<br>");
	}
}
