import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
/*
 * Conclusion - console appender is working it is dividing stream acc to config 
 */
public class Main {
	static Logger logger = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		System.out.println("This is sysout msg");
		System.err.println("This is syserr msg");
		System.out.println("My input msg " );
		logger.fatal("looger 1  fatal");
		logger.error("logger 1  err");
		logger.warn("logger  1 warn");
		logger.info("logger  1 info");
		logger.debug("logger 1  debug");
		logger.trace("logger 1  trace");
		
		logger.fatal("looger 2  fatal");
		logger.error("logger 2  err");
		logger.warn("logger  2 warn");
		logger.info("logger  2 info");
		logger.debug("logger 2  debug");
		logger.trace("logger 2   trace");

	}
	/*
	 * To test logger console appender is working or not call 
	 * java -cp .;.\..\lib\apache-logging-log4j.jar Main 1>out.txt 2>err.txt
	 * from D:\EclipseWorkspaceForHFs\MyPOCEclipse\LoggerTest\bin
	 */

}
