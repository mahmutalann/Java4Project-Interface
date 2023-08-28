package interfaces;

public class Utils {
	public static void runLoggers(Logger [] loggers, String message) { //When using static it should begin the class name of the class in the method.
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
	/*
	public static class java() { //In Java, classes can not use static but inner classes use static.
		
	}
	*/
}
